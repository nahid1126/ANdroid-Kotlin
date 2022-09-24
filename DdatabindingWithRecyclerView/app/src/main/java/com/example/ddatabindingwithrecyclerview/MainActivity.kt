package com.example.ddatabindingwithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ddatabindingwithrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val userList = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        createUser()
        val recyclerView = binding.recyclerView
        val userAdapter = UserAdapter(this,userList)

        recyclerView.adapter = userAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun createUser() {
        userList.add(User(1, "Nahid"))
        userList.add(User(2, "Hasan"))
        userList.add(User(3, "Robi"))
        userList.add(User(4, "Kamrul"))
        userList.add(User(5, "Al-Amin"))
        userList.add(User(6, "Saiful"))
        userList.add(User(7, "Tareq"))
        userList.add(User(1, "Nahid"))
        userList.add(User(2, "Hasan"))
        userList.add(User(3, "Robi"))
        userList.add(User(4, "Kamrul"))
        userList.add(User(5, "Al-Amin"))
        userList.add(User(6, "Saiful"))
        userList.add(User(7, "Tareq"))
        userList.add(User(1, "Nahid"))
        userList.add(User(2, "Hasan"))
        userList.add(User(3, "Robi"))
        userList.add(User(4, "Kamrul"))
        userList.add(User(5, "Al-Amin"))
        userList.add(User(6, "Saiful"))
        userList.add(User(7, "Tareq"))
        userList.add(User(1, "Nahid"))
        userList.add(User(2, "Hasan"))
        userList.add(User(3, "Robi"))
        userList.add(User(4, "Kamrul"))
        userList.add(User(5, "Al-Amin"))
        userList.add(User(6, "Saiful"))
        userList.add(User(7, "Tareq"))

    }
}