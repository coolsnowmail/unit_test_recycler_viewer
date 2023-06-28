package com.skill_factory.unit9.adapter

import androidx.recyclerview.widget.DiffUtil
import com.skill_factory.unit9.model.Ad
import com.skill_factory.unit9.model.Item
import com.skill_factory.unit9.model.Product

class ItemDiffUtil(val newList: List<Item>, val oldList: List<Item>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return if ((oldList[oldItemPosition] is Product && newList[newItemPosition] is Product) || (oldList[oldItemPosition] is Ad && newList[newItemPosition] is Ad)) {
            oldList[oldItemPosition].id == newList[newItemPosition].id
        } else {
            false
        }
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

}
