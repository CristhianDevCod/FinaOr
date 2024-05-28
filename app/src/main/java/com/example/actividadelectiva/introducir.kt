package com.example.actividadelectiva

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class introducir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introducir_gastos)
    }

    fun irHistorial(view : View){
        val intent = Intent(this, historial::class.java).apply {  }
        startActivity(intent)
    }

    fun irActualizacion(view : View){
        val intent = Intent(this, actualizacion::class.java).apply {  }
        startActivity(intent)
    }
}