package com.example.assignment12_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnSignUp: Button
    lateinit var btnLogIn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickOn()

    }

    fun clickOn() {
        btnSignUp=findViewById(R.id.btnSignUp)
        btnLogIn=findViewById(R.id.btnLogIn)

    btnSignUp.setOnClickListener {
            val intent= Intent(baseContext,SignUp::class.java)
            startActivity(intent)
    }
}}