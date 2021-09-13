package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecaudosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos)

        MyToolbar().show(this, "Recaudos", true)
        val recaudo = findViewById<Button>(R.id.btnRecaudo)

        recaudo.setOnClickListener(){
            val ventanaRecaudos = Intent(this, RecaudosActivity2::class.java)
            startActivity(ventanaRecaudos)
        }

    }
}