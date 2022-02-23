package com.tejaswisapplication.app.modules.productdetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tejaswisapplication.app.modules.productdetail.`data`.model.ProductDetail2RowModel
import com.tejaswisapplication.app.modules.productdetail.`data`.model.ProductDetail3RowModel
import com.tejaswisapplication.app.modules.productdetail.`data`.model.ProductDetailModel
import kotlin.collections.MutableList

public class ProductDetailVM : ViewModel() {
  public val productDetailModel: MutableLiveData<ProductDetailModel> =
      MutableLiveData(ProductDetailModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup24List: MutableLiveData<MutableList<ProductDetail2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerRecomendedList: MutableLiveData<MutableList<ProductDetail3RowModel>> =
      MutableLiveData(mutableListOf())
}
