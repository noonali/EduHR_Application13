package com.example.hanan.eduhr_application

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnNextActivity.setOnClickListener() {
            val intent = Intent(this, ChooseUserType::class.java)
            startActivity(intent)

        }
    }
}
