package com.example.ddatabindingwithrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ddatabindingwithrecyclerview.databinding.RowItemBinding

class UserAdapter(private val context: Context, private var userList: List<User>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    private lateinit var binding: RowItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = RowItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userModel = userList[position]
        holder.setData(userModel)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(private val binding: RowItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(user: User) {
            binding.user = user
        }
    }
}