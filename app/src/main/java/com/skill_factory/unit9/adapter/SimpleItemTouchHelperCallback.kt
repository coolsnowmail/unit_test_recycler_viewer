package com.skill_factory.unit9.adapter

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.skill_factory.unit9.model.Item

class SimpleItemTouchHelperCallback(val adapter: ProductAdapter): ItemTouchHelper.Callback() {
    override fun getMovementFlags(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
        val swipeFlags = ItemTouchHelper.END
        return makeMovementFlags(0, swipeFlags)
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val newList = arrayListOf<Item>()
        newList.addAll(adapter.items)
        newList.removeAt(viewHolder.adapterPosition)
        val diff = ItemDiffUtil(adapter.items, newList)
        val diffResult = DiffUtil.calculateDiff(diff)
        adapter.items = newList
        diffResult.dispatchUpdatesTo(adapter)
    }

    override fun isLongPressDragEnabled(): Boolean {
        return false
    }

    override fun isItemViewSwipeEnabled(): Boolean {
        return true
    }
}