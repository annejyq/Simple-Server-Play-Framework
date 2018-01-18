package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Contact extends Model{

    @Id
    public int id;
    public String name;
    public String address;
    public String zipcode;
    public String number;
    public String color;

    public Contact(){

    }

    public Contact(int id, String name, String address, String zipcode, String number, String color){
        this.id = id;
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.number = number;
        this.color = color;
    }

    public static Finder<Integer, Contact> find = new Finder<>(Contact.class);

    static{
        Contacts = new HashSet<>();
    }


    public String GetName() {
        return name;
    }

    public String GetAddress(){
        return address;
    }

    public String GetZipcode(){
        return zipcode;
    }

    public String GetNumber(){
        return number;
    }

    public String GetColor(){
        return color;
    }

    private static Set<Contact> Contacts;


    public static Set<Contact> allContacts(){
        Contacts.addAll(find.all());
        return Contacts;
    }

    public static Contact findById(Integer id){
        for(Contact contact : Contacts){
            if(id.equals(contact.id)){
                return contact;
            }
        }
        return null;
    }
    public static int NextId(){
        return find.all().size() + 1;
    }

    public static void add(Contact contact){
        Contacts.add(contact);
    }

    public static int size(){
        return Contacts.size();
    }

    public boolean isValid(){
        return isValidFullName(name)
                && isValidZipcode(zipcode)
                && isValidPhoneNumber(number)
                && isValidColor(color);
    }

    public static boolean isValidName(String name){
        return name.matches("[a-zA-Z]*");
    }

    public static boolean isValidFullName(String fullname){
        return fullname.matches("[a-zA-Z]*\\s[a-zA-Z]*");
    }

    public static boolean isValidZipcode(String zipcode){
        String ZipcodePattern1 = "\\d{5}";              // 99999
        String ZipcodePattern2 = "\\d{5}\\-{1}\\d{4}";  // 99999-1234
        return zipcode.matches(ZipcodePattern1) || zipcode.matches(ZipcodePattern2);
    }

    public static boolean isValidPhoneNumber(String number){
        String NumberPattern1 = "\\d{3}\\s\\d{3}\\s\\d{4}";      // 703 955 0373
        String NumberPattern2 = "\\d{3}\\-\\d{3}\\-\\d{4}";      // 876-543-2104
        String NumberPattern3 = "\\(\\d{3}\\)\\-\\d{3}\\-\\d{4}";// (703)-742-0996
        return number.matches(NumberPattern1) || number.matches(NumberPattern2) || number.matches(NumberPattern3);
    }

    public static boolean isValidColor(String color){
        return color.matches("[a-zA-Z]*");
    }

    public static String[] isValidFormat(String line){
        String[] input = line.split("\\s*,\\s*");
        String[] data = new String[5];
        // (firstname, lastname, number, color, zipcode)
        boolean Format1 = isValidName(input[0]) && isValidName(input[1]) && isValidPhoneNumber(input[2])
                && isValidColor(input[3]) && isValidZipcode(input[4]) && (input.length == 5);
        if(Format1){
            data[0] = input[0] + " " + input[1]; data[1] = "";
            data[2] = input[4]; data[3] = input[2]; data[4] = input[3];
            return data;
        }
        // (firstname lastname, color, zipcode, phone number)
        boolean Format2 = isValidFullName(input[0]) && isValidColor(input[1]) && isValidZipcode(input[2])
                && isValidPhoneNumber(input[3]) && (input.length == 4);
        if(Format2){
            data[0] = input[0]; data[1] = ""; data[2] = input[2];
            data[3] = input[3]; data[4] = input[1];
            return data;
        }
        // (firstname, lastname, zipcode, phone number, color)
        boolean Format3 = isValidName(input[0]) && isValidName(input[1]) && isValidZipcode(input[2])
                && isValidPhoneNumber(input[3]) && isValidColor(input[4]) && (input.length == 5);
        if(Format3){
            data[0] = input[0] + " " + input[1]; data[1] = "";
            data[2] = input[2]; data[3] = input[3]; data[4] = input[4];
            return data;
        }
        // (firstname lastname, address, zipcode, phone number, color)
        boolean Format4 = isValidFullName(input[0]) && isValidZipcode(input[2]) && isValidPhoneNumber(input[3])
                && isValidColor(input[4]) && (input.length == 5);
        if(Format4){
            data[0] = input[0]; data[1] = input[1]; data[2] = input[2];
            data[3] = input[3]; data[4] = input[4];
            return data;
        }
        return data;
    }
}
