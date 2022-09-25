package com.example.ddatabindingwithrecyclerview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.ddatabindingwithrecyclerview.databinding.RowItemBinding

class UserAdapter() :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private val TAG = "UserAdapter"
    private lateinit var binding: RowItemBinding
    private  var userList = ArrayList<User>()
    private lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        mContext = parent.context
        binding = RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userModel = userList[position]
        holder.setData(userModel)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

   inner class ViewHolder(private val binding: RowItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(user: User) {
            binding.user = user
            binding.setSubmitClickListener {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    //this is diffUtils for notify dataset change
    fun setUser(newList: ArrayList<User>){
        val diffUtils = UserDiffUtils(userList,newList);
        val diffResult = DiffUtil.calculateDiff(diffUtils)
        userList = newList
        diffResult.dispatchUpdatesTo(this)
    }
}