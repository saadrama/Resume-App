package com.example.myresume1

import android.widget.TextView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EducationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        val educationDetails = "Bachelor's Degree in Computer Science, Umma University, Graduated in 2020."
        val educationDetailsTextView: TextView = findViewById(R.id.educationDetailsTextView)
        educationDetailsTextView.text = educationDetails
    }
}
