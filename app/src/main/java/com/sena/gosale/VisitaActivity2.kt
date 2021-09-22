package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class VisitaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visita2)

        val ubicaci = findViewById<ImageView>(R.id.btnVUbicacion)
        val AgenCita = findViewById<ImageView>(R.id.btnVCita)

        ubicaci.setOnClickListener{
            val VUbica = Intent(this, VisitafinalActivity::class.java)
            startActivity(VUbica)
        }
        AgenCita.setOnClickListener{
            val Vcita = Intent(this, VisitaAgendaActivity::class.java)
            startActivity(Vcita)
        }

    }
}