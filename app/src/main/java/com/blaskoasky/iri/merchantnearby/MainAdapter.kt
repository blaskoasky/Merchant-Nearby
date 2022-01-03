package com.blaskoasky.iri.merchantnearby

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.blaskoasky.iri.merchantnearby.databinding.MerchantRowBinding

class MainAdapter(private val mContext: Context) :
    RecyclerView.Adapter<MainAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = MerchantRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(mContext)
    }

    override fun getItemCount(): Int = 16

    inner class ListViewHolder(private val binding: MerchantRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(context: Context) {
            binding.itemContainer.setOnClickListener {
                Toast.makeText(context, "item clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}