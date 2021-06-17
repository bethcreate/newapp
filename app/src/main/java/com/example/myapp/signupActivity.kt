package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.content.ContextCompat.startActivity

class signupActivity : AppCompatActivity() {
    lateinit var etname: EditText
    lateinit var etEmail : EditText
    lateinit var etPhone : EditText
    lateinit var etPASSWORD: EditText
    lateinit var btnSignup : Button
    lateinit var spGender : Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


    }
    fun castView(){
        etname=findViewById(R.id.etName)
        etEmail=findViewById(R.id.etEmail)
        etPhone=findViewById(R.id.etPhone)
        etPASSWORD=findViewById(R.id.etPASSWORD)
        btnSignup = findViewById(R.id.btnSignup)
        spGender = findViewById(R.id.spGender)

    var gender=arrayOf("FEMALE","MALE")
    var genderAdapter= ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,gender)
    genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    spGender.adapter=genderAdapter

}
fun onClick(){
    btnSignup.setOnClickListener {
        var  name = etname.text.toString()
        var email=etEmail.text.toString()
        var phone=etPhone.text.toString()
        var password=etPASSWORD.text.toString()
        var gender=spGender.selectedItem.toString()
        var User=User(name,email,phone,password,gender)

        Toast.makeText(baseContext,User.toString(),Toast.LENGTH_LONG).show()
        var intent= Intent(baseContext, MainActivity::class.java)
        startActivity(intent)
    }
}

data class User(var name:String,var email:String,var phone:String,var password:String,var gender:String)}