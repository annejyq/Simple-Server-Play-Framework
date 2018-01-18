
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Contact],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contactForm : Form[Contact]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
  <head>
      <title> Create Contact </title>
  </head>
  <body>
      <h1>Create Contact</h1>
        """),_display_(/*10.10*/helper/*10.16*/.form(action=routes.HomeController.save())/*10.58*/ {_display_(Seq[Any](format.raw/*10.60*/("""
            """),_display_(/*11.14*/helper/*11.20*/.inputText(contactForm("name"))),format.raw/*11.51*/("""
            """),_display_(/*12.14*/helper/*12.20*/.inputText(contactForm("address"))),format.raw/*12.54*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(contactForm("zipcode"))),format.raw/*13.54*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(contactForm("number"))),format.raw/*14.53*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(contactForm("color"))),format.raw/*15.52*/("""
            """),format.raw/*16.13*/("""<input type="submit" value="Create Contact">
        """)))}),format.raw/*17.10*/("""
      """),format.raw/*18.7*/("""<form action="/">
          <input type="submit" value="Return" />
      </form>


  </body>
</html>
"""))
      }
    }
  }

  def render(contactForm:Form[Contact]): play.twirl.api.HtmlFormat.Appendable = apply(contactForm)

  def f:((Form[Contact]) => play.twirl.api.HtmlFormat.Appendable) = (contactForm) => apply(contactForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jan 18 03:12:53 EST 2018
                  SOURCE: /Users/yunqingjiang/Desktop/Max2App/app/views/create.scala.html
                  HASH: ab6d97e93e3305980f7d279c2eb5c1f872c8e297
                  MATRIX: 956->1|1058->32|1103->30|1130->48|1157->49|1296->161|1311->167|1362->209|1402->211|1443->225|1458->231|1510->262|1551->276|1566->282|1621->316|1662->330|1677->336|1732->370|1773->384|1788->390|1842->423|1883->437|1898->443|1951->475|1992->488|2077->542|2111->549
                  LINES: 28->1|31->2|34->1|35->3|36->4|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|49->17|50->18
                  -- GENERATED --
              */
          