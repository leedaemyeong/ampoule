
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object learn_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class learn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[RequestHeader,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""

"""),_display_(/*3.2*/main("tBOB for your beautiful life")/*3.38*/ {_display_(Seq[Any](format.raw/*3.40*/("""

    """),format.raw/*5.5*/("""OK!!

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply()(request,messages,webJarAssets)

  def f:(() => (RequestHeader,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = () => (request,messages,webJarAssets) => apply()(request,messages,webJarAssets)

  def ref: this.type = this

}


}

/**/
object learn extends learn_Scope0.learn
              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 07:03:26 KST 2016
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/learn.scala.html
                  HASH: 506d3d192d99bbc4312cf16d3f306586e2f4e836
                  MATRIX: 556->1|734->84|762->87|806->123|845->125|877->131|913->138
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7
                  -- GENERATED --
              */
          