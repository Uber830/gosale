package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.sena.gosale.databinding.ActivityClientesInformacionBinding

class ClientesInformacionActivity : AppCompatActivity() {

    private lateinit var ClInfo: ActivityClientesInformacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ClInfo = ActivityClientesInformacionBinding.inflate(layoutInflater)
        setContentView(ClInfo.root)

        ClInfo.btnUbicacion.setOnClickListener{ ubicacion() }
        ClInfo.btnCompra.setOnClickListener{ Compra()}

        //---validacion si llenan todos los campos del registro del celular
        ClInfo.txtPhoneMovil.doOnTextChanged { text, start, before, count ->
            if (text!!.length > 10) {
                ClInfo.txtPhoneMovil.error = "No mas!"
            }else if (text.length < 10) {
                ClInfo.txtPhoneMovil.error = null
            }
        }
    }

    //--------Nos lleva al mapa
    private fun ubicacion(){
        val ventanaUbica = Intent(this, ClientesInformacionDescripcionActivity::class.java)
        startActivity(ventanaUbica)

        Toast.makeText(applicationContext, "Localization", Toast.LENGTH_SHORT).show()
    }
    //------- Nos lleva a los productos
    private fun Compra(){
        val ventanaProduc = Intent(this, ProductoActivity::class.java)
        startActivity(ventanaProduc)

        Toast.makeText(applicationContext, "Trolley", Toast.LENGTH_SHORT).show()
    }
}