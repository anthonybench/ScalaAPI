
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
import play.api.mvc._
import play.api.data._

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Hello World")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
    """),_display_(/*4.6*/defining(play.core.PlayVersion.current)/*4.45*/ { version =>_display_(Seq[Any](format.raw/*4.58*/("""
    
        """),format.raw/*6.9*/("""<h1>Hello World</h1>
    
    """)))}),format.raw/*8.6*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-17T19:34:15.762
                  SOURCE: /home/sleepyboy/ScalaAPI/play-samples-play-scala-hello-world-tutorial/app/views/test.scala.html
                  HASH: 2aa088b81acd50b6c084180686b346038c094fb9
                  MATRIX: 721->1|817->4|844->6|871->25|910->27|941->33|988->72|1038->85|1078->99|1138->130
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|30->6|32->8
                  -- GENERATED --
              */
          