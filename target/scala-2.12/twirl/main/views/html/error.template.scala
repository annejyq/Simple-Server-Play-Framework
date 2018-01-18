
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

object error extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(str : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<html>
  <head>
      <title> Error! </title>
  </head>
  <body>
      <h1>"""),_display_(/*8.12*/str),format.raw/*8.15*/("""</h1>
      <form action="/">
          <input type="submit" value="Return" />
      </form>
  </body>
</html>
"""))
      }
    }
  }

  def render(str:String): play.twirl.api.HtmlFormat.Appendable = apply(str)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (str) => apply(str)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jan 18 03:12:53 EST 2018
                  SOURCE: /Users/yunqingjiang/Desktop/Max2App/app/views/error.scala.html
                  HASH: 336433f4ff8725dc5b8f2c4736aea8c3fbcb5e72
                  MATRIX: 948->1|1057->15|1085->17|1187->93|1210->96
                  LINES: 28->1|33->1|35->3|40->8|40->8
                  -- GENERATED --
              */
          