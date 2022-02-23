package com.tejaswisapplication.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.databinding.RowProductDetail3Binding
import com.tejaswisapplication.app.modules.productdetail.`data`.model.ProductDetail3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerRecomendedAdapter(
  public var list: List<ProductDetail3RowModel>
) : RecyclerView.Adapter<RecyclerRecomendedAdapter.RowProductDetail3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductDetail3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_product_detail3,parent,false)
    return RowProductDetail3VH(view)
  }

  public override fun onBindViewHolder(holder: RowProductDetail3VH, position: Int): Unit {
    val productDetail3RowModel = ProductDetail3RowModel()
    // TODO uncomment following line after integration with data source
    // val productDetail3RowModel = list[position]
    holder.binding.productDetail3RowModel = productDetail3RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProductDetail3RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProductDetail3RowModel
    ): Unit {
    }
  }

  public inner class RowProductDetail3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProductDetail3Binding = RowProductDetail3Binding.bind(itemView)
  }
}
