package com.tejaswisapplication.app.modules.productdetail.`data`.model

import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ProductDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtProductname: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSelectSize: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_select_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSelectColor: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_select_color)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_nike_air_ma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSpecification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_specification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtReviewProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_review_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeMoreLink: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRattings: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtReview: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJamesLawson: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_james_lawson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_alw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDate: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouMightAlso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_might_also)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNikeAirMaxRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_27)

)
