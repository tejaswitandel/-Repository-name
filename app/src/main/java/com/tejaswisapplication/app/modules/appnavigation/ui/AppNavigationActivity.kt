package com.tejaswisapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.base.BaseActivity
import com.tejaswisapplication.app.databinding.ActivityAppNavigationBinding
import com.tejaswisapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.tejaswisapplication.app.modules.productdetail.ui.ProductDetailActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearProductDetail.setOnClickListener {
      val destIntent = ProductDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
