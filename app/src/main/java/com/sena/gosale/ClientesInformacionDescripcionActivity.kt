package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class ClientesInformacionDescripcionActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map:GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientes_informacion_descripcion)

        val mapa = findViewById<View>(R.id.map)
        createFragment()

        mapa.setOnClickListener{
            val ventanaMapa = Intent(this, ClientesLocalizacionActivity::class.java)
            startActivity(ventanaMapa)
        }
    }
    //creacion del mapa
    private fun createFragment() {
        val mapFragment : SupportMapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    //cuando el mapa halla sido creado
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        createMarker()
    }
    //creacion de un marcador en el mapa
    private fun createMarker() {
        val coordinates = LatLng(4.7063778,-74.2256662)
        val marker = MarkerOptions().position(coordinates).title("Parque de Mosquera")
        map.addMarker(marker)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f),
            4000,
            null
        )
    }
}