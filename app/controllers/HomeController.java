package controllers;

import models.Contact;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Inject;
import java.io.*;
import java.net.HttpURLConnection;
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private final static String CLIENT_ID = "LK23C4BKL4PW12NPI1P4C01KATNVH50WNJIASZLRW1GLVZBG";
    private final static String CLIENT_SECRET = "JL5UFSP4IGY5LJNL4DCTGHE4I2WBM3YS1JTEK4GBSPPUVGTO";

    @Inject
    FormFactory formFactory;


    public Result index() {

        //Set<Contact> contacts = Contact.allContacts();
        List<Contact> contacts = Contact.find.all();

        return ok(index.render(contacts));
    }

    public Result create(){
        Form<Contact> contactForm = formFactory.form(Contact.class);
        return ok(create.render(contactForm));
    }

    public Result Add() {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = request().body().asJson();
        String name = json.findPath("name").textValue();
        String address = json.findPath("address").textValue();
        String zipcode = json.findPath("zipcode").textValue();
        String number = json.findPath("number").textValue();
        String color = json.findPath("color").textValue();
        if (name == null || address == null || zipcode == null || number == null || color == null) {
            return badRequest("Missing Parameters");
        }
        int i = Contact.NextId();
        Contact c = new Contact(i, name, address,zipcode,number,color);
        if(c.isValid()){
            Contact.add(c);
            c.save();
            ObjectNode on = mapper.createObjectNode();
            on.put("Object ID", c.id);
            return jsonResult(ok(on));
        }else{
            return badRequest("Invalid Format. Please try again");
        }

    }

    public Result save(){
        DynamicForm contactForm = formFactory.form().bindFromRequest();
        String name = contactForm.get("name");
        String address = contactForm.get("address");
        String zipcode = contactForm.get("zipcode");
        String number = contactForm.get("number");
        String color = contactForm.get("color");
        Contact c = new Contact(Contact.NextId(), name, address,zipcode,number,color);
        if(c.isValid()){
            Contact.add(c);
            c.save();
            return redirect(routes.HomeController.index());
        }else{
            return ok(error.render("Invalid Format. Please try again."));
        }

    }

    public Result CountColor() {
        Set<Contact> Contacts = Contact.allContacts();
        Map<String, Integer> ColorMap = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        for(Contact contact : Contacts){
            String color = contact.color;
            if (ColorMap.containsKey(color)) {
                ColorMap.put(color, ColorMap.get(color) + 1);
            }else{
                ColorMap.put(color, 1);
            }
        }
        ArrayNode an = mapper.createArrayNode();
        for(String color : ColorMap.keySet()){
            ObjectNode on = mapper.createObjectNode();
            on.put("color", color);
            on.put("count", ColorMap.get(color));
            an.add(on);
        }
        return ok(an);
    }

    public Result CountPeople() {
        Set<Contact> Contacts = Contact.allContacts();
        Map<String, Integer> ColorNumMap = new HashMap<>();
        Map<String, ArrayList<String>> ColorPeopleMap = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        for(Contact contact : Contacts){
            String color = contact.color;
            if(ColorNumMap.containsKey(color)){
                ColorNumMap.put(color, ColorNumMap.get(color) + 1);
                ColorPeopleMap.get(color).add(contact.name);
            }else{
                ColorNumMap.put(color, 1);
                ArrayList<String> people = new ArrayList<>();
                people.add(contact.name);
                ColorPeopleMap.put(color, people);
            }
        }
        ArrayNode an = mapper.createArrayNode();
        for(String color : ColorNumMap.keySet()){
            ObjectNode on = mapper.createObjectNode();
            on.put("color", color);
            on.put("count", ColorNumMap.get(color));
            ArrayNode an_name = mapper.createArrayNode();
            for(String name : ColorPeopleMap.get(color)){
                an_name.add(name);
            }
            on.putPOJO("names", an_name);
            an.add(on);
        }
        return ok(an);

    }

    public Result RequestExternalAPI() {
        String endpoint = "http://api.foursquare.com/v2/venues/search";
        String parameter = "near=New York, NY";
        String client_id = "client_id=" + CLIENT_ID;
        String client_secret = "client_secret=" + CLIENT_SECRET;
        String version = "v=20180116";
        String api_url = endpoint + "?" + parameter + "&" + client_id + "&" + client_secret + "&" + version;
        String testurl = "https://api.foursquare.com/v2/venues/search?ll=40.7484,-73.9857&oauth_token=X2MH14KCEQ3W55SPBDRLPNVFQAHVWQPFLWKRCFMGZHAKPJ40&v=20180117";

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode on = mapper.createObjectNode();
        try {
            URL url = new URL(testurl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("GET");
            conn.connect();
            int ResponseCode = conn.getResponseCode();
            StringBuilder response = new StringBuilder();
            System.out.print("Response: " + ResponseCode);
            if (ResponseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                String Result = response.toString();

                JsonNode jn = mapper.readTree(Result).findPath("venues");
                ArrayNode an = mapper.createArrayNode();
                for (JsonNode node : jn) {
                    String name = node.path("name").asText();
                    an.add(name);
                    System.out.print("name: " + name);
                }
                on.putPOJO("places", an);
            } else {
                System.out.print("Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ok(on);
    }


    public Result ReadLocalFile() throws IOException {

        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> CSVfile = body.getFile("csvfile");
        ArrayList<String> res = new ArrayList<>();
        String fileName = CSVfile.getFilename();

        File infile = CSVfile.getFile();
        String localpath = "/home/ubuntu/upload/";
        //String localpath = "/Users/yunqingjiang/desktop/upload/";
        File outfile = new File(localpath + fileName);
        if(! outfile.createNewFile()) return ok(error.render("Missing File"));
        InputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream(infile);
            os = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            if(is != null && os!=null) {
                is.close();
                os.close();
            }

        }
        BufferedReader bfile = null;
        try {
            bfile = new BufferedReader(new FileReader(localpath + fileName));
            String line = "";
            while ((line = bfile.readLine()) != null) {
                String[] info = Contact.isValidFormat(line);
                if (info[0] != null) {
                    Contact c = new Contact(Contact.NextId(), info[0], info[1], info[2], info[3], info[4]);
                    Contact.add(c);
                    c.save();
                    res.add("Add Contact: " + line);
                    System.out.println("Add Contact: " + line);
                } else {
                    res.add("Invalid Format: " + line);
                    System.err.println("Invalid Format: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.print(e);
        } finally {
            if (bfile != null) {
                bfile.close();
            }
            outfile.delete();
        }
        return ok(upload.render(res));
    }


    private Result jsonResult(Result httpResponse) {
        response().setHeader("Content-Type","application/json");
        return httpResponse;
    }

}
