package com.nahid.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_item.view.*

class UserAdapter(private val context: Context, private var userList: ArrayList<UserModel>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        val userModel = userList[position]
        holder.txtId.text = "ID : ${userModel.id}"
        holder.txtName.text = "Name : ${userModel.name}"
        holder.txtAge.text = "Age : ${userModel.age}"
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtId: TextView = itemView.txtId
        val txtName: TextView = itemView.txtName
        val txtAge: TextView = itemView.txtAge
    }
}