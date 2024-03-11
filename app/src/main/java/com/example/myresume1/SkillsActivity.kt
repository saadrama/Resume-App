package com.example.myresume1

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        // Display skills information
        val skillsDetails = "Proficient in Java, Kotlin, Python, JavaScript, C, C++, C#, UI/UX Design, etc."
        val skillsDetailsTextView: TextView= findViewById(R.id.skillsDetailsTextView)
        skillsDetailsTextView.text = skillsDetails
    }
}
