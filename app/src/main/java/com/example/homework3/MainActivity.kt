package com.example.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edName = findViewById<EditText>(R.id.edName)
        val edLastName = findViewById<EditText>(R.id.edName)
        val edUsername = findViewById<EditText>(R.id.edUsername)
        val edage = findViewById<EditText>(R.id.edAge)
        val edemail = findViewById<EditText>(R.id.edEmail)
        val save = findViewById<Button>(R.id.btnSave)
        val clear = findViewById<Button>(R.id.btnClear)


        save.setOnClickListener {

            var firstname = edName.text.toString()
            var lastName = edLastName.text.toString()
            var Username = edUsername.text.toString()
            var age = edage.text.toString().toInt()
            var email = edemail.text.toString()


            save()

        }

        clear.setOnLongClickListener {
            var firstname = edName.text.toString()
            var lastName = edLastName.text.toString()
            var Username = edUsername.text.toString()
            var age = edage.text.toString().toInt()
            var email = edemail.text.toString()

            firstname.clear()
            lastName.clear()
            Username.clear()
            age.clear()
            email.clear()
            true

        }


    }

    private fun save() {
        empty()
        age()
        length()
        emailValidity()
    }

    private fun empty (name: String, LastName: String, Username: String, email: String) {
        if (name.isNotEmpty() && LastName.isNotEmpty() && Username.isNotEmpty()
            && email.isNotEmpty() && Username.isNotEmpty()) {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
        }else{
        Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()}
    }

    private fun age(){}

    private fun length (Username: String) {
        if (Username.length <= 10) {
            Toast.makeText(
                this,
                "Username shall include at least 10 characters", Toast.LENGTH_SHORT).show()
        }
    }

    private fun emailValidity(email: String) = email.contains("@")

}


