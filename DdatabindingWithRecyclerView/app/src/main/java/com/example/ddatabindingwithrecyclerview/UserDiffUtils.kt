package com.example.ddatabindingwithrecyclerview

import androidx.recyclerview.widget.DiffUtil

class UserDiffUtils (private val oldList: ArrayList<User>, private val newList:ArrayList<User>) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return  oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return  oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return  oldList[oldItemPosition] == newList[newItemPosition]
    }
}