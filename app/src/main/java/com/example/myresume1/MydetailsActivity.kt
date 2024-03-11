package com.example.myresume1

import android.annotation.SuppressLint
import android.widget.TextView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MydetailsActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mydetails)

        val mydetailsDetails = "Name: SAAD RAMAH ABDULLAHI\n ADMNO: BSCS/2020/45697\nPHONE:0769580040\nEMAIL:ramahsaad20@gmail.com"
        val mydetailsDetailsTextView: TextView = findViewById(R.id.mydetailsDetailsTextView)
        mydetailsDetailsTextView.text = mydetailsDetails
    }
}
