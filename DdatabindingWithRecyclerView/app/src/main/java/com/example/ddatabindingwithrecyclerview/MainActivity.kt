package com.example.ddatabindingwithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ddatabindingwithrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val userList = ArrayList<User>()
    private lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)

        userAdapter = UserAdapter()
        createUser()
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = userAdapter
        }
        userAdapter.setUser(userList);
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