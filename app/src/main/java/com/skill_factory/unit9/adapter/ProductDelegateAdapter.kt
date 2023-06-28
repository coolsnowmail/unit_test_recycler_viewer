package com.skill_factory.unit9.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import com.skill_factory.unit9.databinding.ItemBinding
import com.skill_factory.unit9.model.Item
import com.skill_factory.unit9.model.Product

class ProductDelegateAdapter :
    AbsListItemAdapterDelegate<Product, Item, ProductDelegateAdapter.ViewHolder>() {
    inner class ViewHolder(val itemBinding: ItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bindingItem(product: Product) {
            itemBinding.icon.setImageResource(product.idIcon)
            itemBinding.textName.text = product.name
            itemBinding.textDesc.text = product.desc
        }
    }

    override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
        return item is Product
    }

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        return ViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(item: Product, holder: ViewHolder, payloads: MutableList<Any>) {
        holder.bindingItem(item)
    }
}





//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
//import com.skill_factory.unit9.R
//import com.skill_factory.unit9.databinding.ItemBinding
//import com.skill_factory.unit9.model.Item
//import com.skill_factory.unit9.model.Product

//class ProductDelegateAdapter :
//    AbsListItemAdapterDelegate<Product, Item, ProductDelegateAdapter.ViewHolder>() {
//    class ViewHolder {
//
//    }
//
//    override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
//        TODO("Not yet implemented")
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
//        TODO("Not yet implemented")
//    }
//
//    override fun onBindViewHolder(item: Product, holder: ViewHolder, payloads: MutableList<Any>) {
//        TODO("Not yet implemented")
//    }




//    inner class ViewHolder(val itemBinding: ItemBinding) :
//        RecyclerView.ViewHolder(itemBinding.root) {
//        fun bindingItem(product: Product) {
//            itemBinding.icon.setImageResource(product.idIcon)
//            itemBinding.textName.text = product.name
//            itemBinding.textDesc.text = product.desc
//        }
//
//        override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
//            return item is Product
//        }
//
//        override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
//            return ViewHolder(
//                ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//            )
//
//        }
//
//        override fun onBindViewHolder(
//            item: Product,
//            holder: ViewHolder,
//            payloads: MutableList<Any>
//        ) {
//            holder.bindingItem(item)
//        }
//    }
