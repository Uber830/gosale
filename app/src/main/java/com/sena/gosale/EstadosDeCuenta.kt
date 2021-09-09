package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class EstadosDeCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estados_de_cuenta)

        MyToolbar().show(this, "Estados de Cuenta", true)
    }
}