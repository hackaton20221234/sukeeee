package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.*
import com.example.myapplication.dtos.entities.Good
import com.example.myapplication.utils.AppFragmentManager
import com.example.myapplication.utils.GlobalVariables


class RvAdapterGoods(private var goods: ArrayList<Good>):
    RecyclerView.Adapter<RvAdapterGoods.ViewHolder>() {
    private var fragmentManager = GlobalVariables.instance.fragmentManager

    inner class ViewHolder internal constructor(var binding: GoodsFragmentBinding) :
        RecyclerView.ViewHolder(binding.root)

    inner class ViewModel {

        var good= Good()


        fun openEditOfferFragment() {
            fragmentManager.openFragmentAboveMain(AppFragmentManager.FragmentsName.GoodResponsePreviewFragment)
            var binding = fragmentManager.getCurrentFragmentBinding<GoodsFragmentBinding>()
            var viewModel = binding!!.viewModel!!
            viewModel.good=good
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding = GoodsFragmentBinding.bind(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.goods_fragment, parent, false)
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.viewModel = ViewModel()
        holder.binding.viewModel!!.good = goods[position]
    }

    override fun getItemCount(): Int {
        return goods.size
    }
}