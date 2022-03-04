package com.example.proyecto

import android.content.Intent
import android.icu.text.IDNA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }

    fun Info(view: View){
        val intent = Intent(this@PrincipalActivity, InfoActivity::class.java)
        startActivity(intent)
    }

    fun InfoTec(view: View){
        val intent = Intent(this@PrincipalActivity, TecActivity::class.java)
        startActivity(intent)
    }

    fun Asignaturas(view: View){
        val intent = Intent(this@PrincipalActivity, AsignaturasActivity::class.java)
        startActivity(intent)
    }

    fun Avisos(view: View){
        val intent = Intent(this@PrincipalActivity, AvisosActivity::class.java)
        startActivity(intent)
    }
}