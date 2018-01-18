
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Contact],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contacts : List[Contact]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
  <head>
      <title> All Contacts </title>
  </head>
  <body>
      <h1>All Contacts</h1>
      <div class="row">
          <form action="/create">
              <input type="submit" value="Add New Contact" />
          </form>
      </div>
      <div class="row">
          <p>Upload Local File</p>

          """),_display_(/*18.12*/helper/*18.18*/.form(action = routes.HomeController.ReadLocalFile, 'enctype -> "multipart/form-data")/*18.104*/ {_display_(Seq[Any](format.raw/*18.106*/("""

          """),format.raw/*20.11*/("""<input type="file" name="csvfile">

          <p>
              <input type="Submit">
          </p>

          """)))}),format.raw/*26.12*/("""

      """),format.raw/*28.7*/("""</div>

      """),_display_(/*30.8*/for(contact <- contacts) yield /*30.32*/{_display_(Seq[Any](format.raw/*30.33*/("""
        """),format.raw/*31.9*/("""<p>ID: """),_display_(/*31.17*/contact/*31.24*/.id),format.raw/*31.27*/("""</p>
        <p>"""),_display_(/*32.13*/contact/*32.20*/.name),format.raw/*32.25*/("""</p>
        <p>Address: """),_display_(/*33.22*/contact/*33.29*/.address),format.raw/*33.37*/("""</p>
        <p>Zipcode: """),_display_(/*34.22*/contact/*34.29*/.zipcode),format.raw/*34.37*/("""</p>
        <p>Phone Number: """),_display_(/*35.27*/contact/*35.34*/.number),format.raw/*35.41*/("""</p>
        <p>Color: """),_display_(/*36.20*/contact/*36.27*/.color),format.raw/*36.33*/("""</p>
        <br>
      """)))}),format.raw/*38.8*/("""
  """),format.raw/*39.3*/("""</body>

</html>
"""))
      }
    }
  }

  def render(contacts:List[Contact]): play.twirl.api.HtmlFormat.Appendable = apply(contacts)

  def f:((List[Contact]) => play.twirl.api.HtmlFormat.Appendable) = (contacts) => apply(contacts)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jan 18 03:12:53 EST 2018
                  SOURCE: /Users/yunqingjiang/Desktop/Max2App/app/views/index.scala.html
                  HASH: 4eb4d4c15ca62b3231bc1e88b26ee8dad1005e28
                  MATRIX: 955->1|1054->29|1099->27|1126->45|1153->46|1501->367|1516->373|1612->459|1653->461|1693->473|1837->586|1872->594|1913->609|1953->633|1992->634|2028->643|2063->651|2079->658|2103->661|2147->678|2163->685|2189->690|2242->716|2258->723|2287->731|2340->757|2356->764|2385->772|2443->803|2459->810|2487->817|2538->841|2554->848|2581->854|2636->879|2666->882
                  LINES: 28->1|31->2|34->1|35->3|36->4|50->18|50->18|50->18|50->18|52->20|58->26|60->28|62->30|62->30|62->30|63->31|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|70->38|71->39
                  -- GENERATED --
              */
          