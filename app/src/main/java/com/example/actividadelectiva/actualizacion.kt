package com.example.actividadelectiva

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class actualizacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizacion)
    }

    fun irHistorial(view : View){
        val intent = Intent(this, historial::class.java).apply {  }
        startActivity(intent)
    }

    fun irIntroducir(view : View){
        val intent = Intent(this, introducir()::class.java).apply {  }
        startActivity(intent)
    }
}