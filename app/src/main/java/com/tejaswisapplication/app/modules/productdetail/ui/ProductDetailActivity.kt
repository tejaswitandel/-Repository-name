package com.tejaswisapplication.app.modules.productdetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.base.BaseActivity
import com.tejaswisapplication.app.databinding.ActivityProductDetailBinding
import com.tejaswisapplication.app.modules.productdetail.`data`.model.ImageSliderGroup3Model
import com.tejaswisapplication.app.modules.productdetail.`data`.model.ProductDetail2RowModel
import com.tejaswisapplication.app.modules.productdetail.`data`.model.ProductDetail3RowModel
import com.tejaswisapplication.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class ProductDetailActivity :
    BaseActivity<ActivityProductDetailBinding>(R.layout.activity_product_detail) {
  private val imageSliderGroup3Items: ArrayList<ImageSliderGroup3Model> = arrayListOf()

  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup3Adapter = ImageSliderGroup3Adapter(imageSliderGroup3Items,true)
    binding.imageSliderGroup3.adapter = imageSliderGroup3Adapter
    binding.imageSliderGroup3.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup1.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup1.updateIndicatorCounts(binding.imageSliderGroup3.indicatorCount)
    val recyclerGroup24Adapter =
    RecyclerGroup24Adapter(viewModel.recyclerGroup24List.value?:mutableListOf())
    binding.recyclerGroup24.adapter = recyclerGroup24Adapter
    recyclerGroup24Adapter.setOnItemClickListener(
    object : RecyclerGroup24Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductDetail2RowModel) {
        onClickRecyclerGroup24(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup24List.observe(this) {
      recyclerGroup24Adapter.updateData(it)
    }
    val recyclerRecomendedAdapter =
    RecyclerRecomendedAdapter(viewModel.recyclerRecomendedList.value?:mutableListOf())
    binding.recyclerRecomended.adapter = recyclerRecomendedAdapter
    recyclerRecomendedAdapter.setOnItemClickListener(
    object : RecyclerRecomendedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductDetail3RowModel) {
        onClickRecyclerRecomended(view, position, item)
      }
    }
    )
    viewModel.recyclerRecomendedList.observe(this) {
      recyclerRecomendedAdapter.updateData(it)
    }
    binding.productDetailVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup3.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup3.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup24(
    view: View,
    position: Int,
    item: ProductDetail2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerRecomended(
    view: View,
    position: Int,
    item: ProductDetail3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
