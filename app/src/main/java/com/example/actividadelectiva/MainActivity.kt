package com.example.actividadelectiva

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_aplicacion)

        // Usando un Handler para retrasar la acción 3 segundos (3000 milisegundos)
        Handler(Looper.getMainLooper()).postDelayed({
            setContentView(R.layout.activity_main_presupuesto)
        }, 3000)
    }
    fun irActualizacion(view : View){
        val intent = Intent(this, actualizacion::class.java).apply {  }
        startActivity(intent)
    }
}