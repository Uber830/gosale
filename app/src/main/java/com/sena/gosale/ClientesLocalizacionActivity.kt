package com.sena.gosale

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class ClientesLocalizacionActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnMyLocationButtonClickListener, GoogleMap.OnMyLocationClickListener {

    private lateinit var map: GoogleMap

    //codigo del request
    companion object {
        const val REQUEST_CODE_LOCATION = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientes_localizacion)

        createFragment()
    }

    //creacion del mapa
    private fun createFragment() {
        val mapFragment: SupportMapFragment =
            supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    //cuando el mapa halla sido creado, se suscribir los metodos a la vista
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        createMarker()
        map.setOnMyLocationButtonClickListener(this)
        map.setOnMyLocationClickListener(this)
        enableLocation()
    }

    //creacion de un marcador
    private fun createMarker() {
        val coordinates = LatLng(4.7063778, -74.2256662) //ubicacion del parque de mosquera
        val marker = MarkerOptions().position(coordinates).title("Parque de Mosquera")
        map.addMarker(marker)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f),
            4000,
            null
        )
    }

    //saber si el permiso esta aceptado
    private fun isLocatePermissionGranted() = ContextCompat.checkSelfPermission(
        this,
        Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED

    //intentar activar la ubicacion
    private fun enableLocation() {
        if (!::map.isInitialized) return
        if (isLocatePermissionGranted()) {
            map.isMyLocationEnabled = true
        } else {
            requestLocationPermission()
        }
    }

    //metodo que pide los permisos
    private fun requestLocationPermission() {
        //pidio permisos y los rechazo
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
        ) {
            Toast.makeText(this, "Ve a ajustes y acepta los permisos", Toast.LENGTH_SHORT).show()
        } else {
            //se piden los permisos por primera ves
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_CODE_LOCATION
            )
        }
    }

    //capturar la respuesta de cuando el usuario acepta los permisos de la ubicacion
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode){
            REQUEST_CODE_LOCATION -> if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                map.isMyLocationEnabled = true //se activa la ubicacion
            } else {
                Toast.makeText(
                    this,
                    "Para activar la localización ve ha ajustes y acepta los permisos",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else -> {}
        }
    }

    //Comprobar que los servicios siguen activos
    override fun onResumeFragments() {
        super.onResumeFragments()
        if (!::map.isInitialized) return //si el mapa no esta inicializado, salga de hay
        if(isLocatePermissionGranted()){
            map.isMyLocationEnabled = false
            //mensaje informativo
            Toast.makeText(
                this,
                "Para activar la localización ve ha ajustes y acepta los permisos",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    //se manipula la accion al pulsar el boton, false si y true no
    override fun onMyLocationButtonClick(): Boolean {
        Toast.makeText(this, "Boton pulsado", Toast.LENGTH_SHORT).show()
        return false
    }

    //Cada ves que el usuario pulse en el punto de su localizacion, se le mostrara la lonjitud y latitud
    override fun onMyLocationClick(p0: Location) {
        Toast.makeText(this, "Estas en ${p0.latitude}, ${p0.longitude}", Toast.LENGTH_SHORT).show()
    }
}