package com.example.actividadelectiva

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class historial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historial_gasto)
    }

    fun irIntroducir(view : View){
        val intent = Intent(this, introducir()::class.java).apply {  }
        startActivity(intent)
    }
}