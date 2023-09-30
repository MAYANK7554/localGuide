package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

 class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val delhi1 = findViewById<ImageView>(R.id.delhiPic)
        delhi1.setOnClickListener{
            val intent = Intent(this,delhi::class.java)
            startActivity(intent)
        }

        val mumbai1 = findViewById<ImageView>(R.id.mumbaiPic)
        mumbai1.setOnClickListener{
            val intent = Intent(this,mumbai::class.java)
            startActivity(intent)
        }


        val bangalore1 = findViewById<ImageView>(R.id.bangalorePic)
        bangalore1.setOnClickListener{
            val intent = Intent(this,bangalore::class.java)
            startActivity(intent)
        }

        val kolkata1 = findViewById<ImageView>(R.id.kolkataPic)
        kolkata1.setOnClickListener{
            val intent = Intent(this,kolkata::class.java)
            startActivity(intent)
        }
}
}