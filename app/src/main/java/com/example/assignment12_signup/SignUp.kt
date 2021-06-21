package com.example.assignment12_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SignUp : AppCompatActivity() {

    lateinit var spGender: Spinner
    lateinit var btnBack:Button
    lateinit var btnsignUp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        onClick()
    }
   fun  onClick(){
       spGender=findViewById(R.id.spGender)
       btnBack=findViewById(R.id.btnBack)
       btnsignUp=findViewById(R.id.btnsignUp)

       btnBack.setOnClickListener {
           val intent= Intent(baseContext,MainActivity::class.java)
               startActivity(intent)

       }
       var gender= arrayOf("Female","Male")
       var adapter= ArrayAdapter(baseContext,android.R.layout.simple_spinner_dropdown_item,gender)
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
       spGender.adapter=adapter
   }
}