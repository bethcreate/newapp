package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPassword2: EditText
    lateinit var btnlogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        onClick()



    }

    fun castView() {
        etEmail = findViewById(R.id.etEmail)
        etPassword2 = findViewById(R.id.etPassword2)
        btnlogin = findViewById(R.id.btnlogin)



    }

    fun onClick() {
        btnlogin.setOnClickListener {
            var intent = Intent(baseContext, signupActivity::class.java)
            startActivity(intent)

        }
    }
}