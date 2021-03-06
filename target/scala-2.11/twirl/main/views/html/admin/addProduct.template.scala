
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models._
import helper._

Seq[Any](format.raw/*1.75*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User)),format.raw/*5.75*/("""

"""),format.raw/*7.102*/("""

"""),_display_(/*9.2*/admin/*9.7*/.adminMain("Add Product", user)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
	"""),format.raw/*10.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*13.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*13.138*/ {_display_(Seq[Any](format.raw/*13.140*/("""
		
		"""),format.raw/*15.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*17.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*17.81*/("""
		"""),_display_(/*18.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*18.95*/("""

        """),format.raw/*20.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        """),_display_(/*22.10*/for((value, name) <- Category.options) yield /*22.48*/ {_display_(Seq[Any](format.raw/*22.50*/("""
            """),format.raw/*23.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*23.63*/value),format.raw/*23.68*/("""" />"""),_display_(/*23.73*/name),format.raw/*23.77*/("""<br>        
        """)))}),format.raw/*24.10*/("""

		"""),_display_(/*26.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*26.83*/("""
		"""),_display_(/*27.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*27.83*/("""
		"""),_display_(/*28.4*/inputText(addProductForm("size"), '_label -> "Size",'class -> "form-control")),format.raw/*28.81*/("""

		"""),format.raw/*30.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*39.14*/routes/*39.20*/.AdminController.products(0)),format.raw/*39.48*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*43.3*/(""" """),format.raw/*43.4*/("""<!-- End Form definition -->

""")))}),format.raw/*45.2*/(""" """),format.raw/*45.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((play.data.Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


}

/**/
object addProduct extends addProduct_Scope0.addProduct
              /*
                  -- GENERATED --
                  DATE: Fri Apr 07 14:40:45 IST 2017
                  SOURCE: /home/wdd/Desktop/project/up-to-6-4-17/app/views/admin/addProduct.scala.html
                  HASH: a5d17308460d74f5b87d4d2aa725893462bb2e92
                  MATRIX: 803->1|1002->74|1029->109|1056->111|1149->184|1179->287|1207->290|1219->295|1258->326|1297->328|1326->330|1447->425|1592->560|1633->562|1666->568|1787->663|1885->740|1915->744|2027->835|2064->845|2259->1013|2313->1051|2353->1053|2394->1066|2471->1116|2497->1121|2529->1126|2554->1130|2607->1152|2638->1157|2738->1236|2768->1240|2868->1319|2898->1323|2996->1400|3027->1404|3323->1673|3338->1679|3387->1707|3490->1780|3518->1781|3579->1812|3607->1813
                  LINES: 27->1|33->1|34->4|35->5|35->5|37->7|39->9|39->9|39->9|39->9|40->10|43->13|43->13|43->13|45->15|47->17|47->17|48->18|48->18|50->20|52->22|52->22|52->22|53->23|53->23|53->23|53->23|53->23|54->24|56->26|56->26|57->27|57->27|58->28|58->28|60->30|69->39|69->39|69->39|73->43|73->43|75->45|75->45
                  -- GENERATED --
              */
          