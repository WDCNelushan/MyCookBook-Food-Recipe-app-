package com.example.mycookbook_recipefinderapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnBack1 = findViewById<ImageButton>(R.id.btnBack)
        btnBack1.setOnClickListener {
            startActivity(Intent(this, Onboarding::class.java))
            finish()
        }

        val btnSignIn= findViewById<Button>(R.id.btn_signIn)
        btnSignIn.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
            finish()
        }

        val linksignUp = findViewById<TextView>(R.id.link_signUp)
        linksignUp.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
            finish()
        }

        val linkfgPassword = findViewById<TextView>(R.id.fg_password)
        linkfgPassword.setOnClickListener {
            startActivity(Intent(this, ForgotPassword::class.java))
            finish()
        }
    }
}