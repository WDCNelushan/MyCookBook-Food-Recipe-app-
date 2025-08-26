package com.example.mycookbook_recipefinderapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgot_password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnBack2 = findViewById<ImageButton>(R.id.btnBack)
        btnBack2.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
            finish()
        }

        val btnSignUp= findViewById<Button>(R.id.btn_forgotPassword)
        btnSignUp.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
            finish()
        }
    }
}