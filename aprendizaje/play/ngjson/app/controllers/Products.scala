package controllers

import play.api.mvc.{Action, Controller}
import models.Product
import play.api.libs.json.Json
import play.api.libs.json._
import play.api.Logger

object Products extends Controller {

  /**
   * Debe de estar antes
   */
  implicit object ProductWrites extends Writes[Product] {
    def writes(p: Product):JsValue = Json.obj(
      "ean" -> Json.toJson(p.ean),
      "name" -> Json.toJson(p.name),
      "description" -> Json.toJson(p.description)
    )

    def reads(json: JsValue): JsResult[Product] =JsSuccess(
      Product(
        (json \ "ean").as[Long],
        (json \ "name").as[String],
        (json \ "description").as[String]

      ) )

  }


  def codigos = Action {
    val productCodes = Product.findAll.map(_.ean)
    Ok(Json.toJson(productCodes))
  }

  def productos= Action {
    val productos = Product.findAll

    val serializado=Json.toJson(productos)
    Ok(serializado)

  }




  def details(ean: Long) = Action {


    Product.findByEan(ean).map { product =>
      Ok(Json.toJson(product))
    }.getOrElse(NotFound)
  }


}
