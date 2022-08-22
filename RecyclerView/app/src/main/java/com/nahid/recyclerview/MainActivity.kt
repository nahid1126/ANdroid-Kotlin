package com.nahid.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val userList = ArrayList<UserModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createUser()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserAdapter(this, userList)

    }

    private fun createUser() {
        userList.add(UserModel(1, "Nahid", 24))
        userList.add(UserModel(2, "Hasan", 23))
        userList.add(UserModel(3, "Robi", 25))
        userList.add(UserModel(4, "Kamrul", 27))
        userList.add(UserModel(5, "Al-Amin", 24))
        userList.add(UserModel(6, "Saiful", 24))
        userList.add(UserModel(7, "Tareq", 24))
        userList.add(UserModel(1, "Nahid", 24))
        userList.add(UserModel(2, "Hasan", 23))
        userList.add(UserModel(3, "Robi", 25))
        userList.add(UserModel(4, "Kamrul", 27))
        userList.add(UserModel(5, "Al-Amin", 24))
        userList.add(UserModel(6, "Saiful", 24))
        userList.add(UserModel(7, "Tareq", 24))
        userList.add(UserModel(1, "Nahid", 24))
        userList.add(UserModel(2, "Hasan", 23))
        userList.add(UserModel(3, "Robi", 25))
        userList.add(UserModel(4, "Kamrul", 27))
        userList.add(UserModel(5, "Al-Amin", 24))
        userList.add(UserModel(6, "Saiful", 24))
        userList.add(UserModel(7, "Tareq", 24))
        userList.add(UserModel(1, "Nahid", 24))
        userList.add(UserModel(2, "Hasan", 23))
        userList.add(UserModel(3, "Robi", 25))
        userList.add(UserModel(4, "Kamrul", 27))
        userList.add(UserModel(5, "Al-Amin", 24))
        userList.add(UserModel(6, "Saiful", 24))
        userList.add(UserModel(7, "Tareq", 24))

    }
}