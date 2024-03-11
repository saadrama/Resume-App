package com.example.myresume1

import android.widget.TextView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ExperienceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experience)

        // Display experience information
        val experienceDetails = "Worked at TSCONECT Compony as a Software Developer from 2020 to Present. Responsible for software testing"
        val experienceDetailsTextView: TextView= findViewById(R.id.experienceDetailsTextView)
        experienceDetailsTextView.text = experienceDetails
    }
}
