
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

object upload extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[ArrayList[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(res : ArrayList[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<html>
  <head>
      <title> Upload Result </title>
  </head>
  <body>
      <h1>Upload Result</h1>
      """),_display_(/*9.8*/for(str <- res) yield /*9.23*/{_display_(Seq[Any](format.raw/*9.24*/("""
        """),format.raw/*10.9*/("""<p>"""),_display_(/*10.13*/str),format.raw/*10.16*/("""</p>
      """)))}),format.raw/*11.8*/("""
      """),format.raw/*12.7*/("""<a href="/" class="button">Return</a>
  </body>
</html>
"""))
      }
    }
  }

  def render(res:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(res)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (res) => apply(res)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jan 18 02:12:32 EST 2018
                  SOURCE: /Users/yunqingjiang/Desktop/Max2App/app/views/upload.scala.html
                  HASH: f54fee73643378750f5d4270008b570b57163ce8
                  MATRIX: 960->1|1080->26|1108->28|1241->136|1271->151|1309->152|1345->161|1376->165|1400->168|1442->180|1476->187
                  LINES: 28->1|33->1|35->3|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12
                  -- GENERATED --
              */
          