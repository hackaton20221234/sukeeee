package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.utils.GlobalVariables
import com.example.myapplication.R
import com.example.myapplication.databinding.*
import com.example.myapplication.databinding.ActivityMainBinding.bind
import com.example.myapplication.dtos.entities.Good
import com.example.myapplication.dtos.entities.Response
import com.example.myapplication.fragments.GoodResponsePreviewFragment
import com.example.myapplication.utils.AppFragmentManager


class RvAdapterResponses(private var responces: ArrayList<Response>):
    RecyclerView.Adapter<RvAdapterResponses.ViewHolder>() {
    private var fragmentManager = GlobalVariables.instance.fragmentManager

    inner class ViewHolder internal constructor(var binding: GoodsFragmentBinding) :
        RecyclerView.ViewHolder(binding.root)

    inner class ViewModel {

        var response= Response()


        fun openResponseFragment() {
            fragmentManager.openFragmentAboveMain(AppFragmentManager.FragmentsName.GoodResponsePreviewFragment)
            var binding = fragmentManager.getCurrentFragmentBinding<GoodsFragmentBinding>()
            var viewModel = binding!!.viewModel!!
            viewModel.response =response
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding = GoodResponsePreviewBiding.bind(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.goods_fragment, parent, false)
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.viewModel = ViewModel()
        holder.binding.viewModel!!.response = responces[position]
    }

    override fun getItemCount(): Int {
        return responces.size
    }

}