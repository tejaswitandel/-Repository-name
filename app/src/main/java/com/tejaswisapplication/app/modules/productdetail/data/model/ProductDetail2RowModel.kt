package com.tejaswisapplication.app.modules.productdetail.`data`.model

import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ProductDetail2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShown: String? = MyApp.getInstance().resources.getString(R.string.lbl_shown)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLaserBlueAnth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laser_blue_anth)

)
