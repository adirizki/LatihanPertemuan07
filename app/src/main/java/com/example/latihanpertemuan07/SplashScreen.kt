package com.example.latihanpertemuan07

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihanpertemuan07.databinding.ActivitySplashScreenBinding
import android.os.Handler


class SplashScreen : AppCompatActivity() {
    lateinit var sharedPref : SharedPreferences
    lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPref = getSharedPreferences("DataUser", Context.MODE_PRIVATE)

        if(sharedPref.contains("userID")){
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
            finish()
        } else{
            Handler().postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 4000)
        }
    }
}