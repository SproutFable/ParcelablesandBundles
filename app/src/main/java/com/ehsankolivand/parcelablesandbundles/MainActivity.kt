package com.ehsankolivand.parcelablesandbundles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ehsankolivand.parcelablesandbundles.model.Person

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this,MainActivity2::class.java).apply {
            putExtra("person",Person("ehsan","kolivand",29))
        }
        startActivity(intent)
    }
}