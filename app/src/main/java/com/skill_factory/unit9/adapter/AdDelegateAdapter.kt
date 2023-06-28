package com.skill_factory.unit9.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import com.skill_factory.unit9.R
import com.skill_factory.unit9.databinding.ItemAdBinding
import com.skill_factory.unit9.model.Ad
import com.skill_factory.unit9.model.Item

class AdDelegateAdapter : AbsListItemAdapterDelegate<Ad, Item, AdDelegateAdapter.ViewHolder>() {
    inner class ViewHolder(val itemAdBinding: ItemAdBinding) :
        RecyclerView.ViewHolder(itemAdBinding.root) {
        fun bindingItem(product: Ad) {
            itemAdBinding.title.text = product.title
            itemAdBinding.content.text = product.content
        }
    }

    override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
       return item is Ad
    }

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
       return ViewHolder(
           ItemAdBinding.inflate(
               LayoutInflater.from(parent.context),
               parent,
               false
           )
        )
    }

    override fun onBindViewHolder(item: Ad, holder: ViewHolder, payloads: MutableList<Any>) {
        holder.bindingItem(item)
    }
}