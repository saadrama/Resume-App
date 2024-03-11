package com.example.myresume1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 5000
    private var handlerThread: HandlerThread? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        handlerThread = HandlerThread("MyHandlerThread")
        handlerThread?.start()

        val handler = handlerThread?.looper?.let { Handler(it) }

        if (handler != null) {
            handler.postDelayed({
                val intent = Intent(this, LandingActivity::class.java)
                startActivity(intent)
                finish() // Close the splash screen activity
            }, SPLASH_DELAY)
        }
    }
}
