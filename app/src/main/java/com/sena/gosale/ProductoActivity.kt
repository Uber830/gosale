package com.sena.gosale

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.sena.gosale.databinding.ActivityProductoBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ProductoActivity : AppCompatActivity(), SearchView.OnQueryTextListener {

    private lateinit var producto: ActivityProductoBinding
    private lateinit var adapter: ProductsAdapter
    private val productsImages = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        producto = ActivityProductoBinding.inflate(layoutInflater)
        setContentView(producto.root)

        producto.svProducts.setOnQueryTextListener(this)

        //----metodo
        initRecycleView()

      /*  producto.imageBrocha.setOnClickListener{ brocha() }
        producto.imageRodillo.setOnClickListener{ rodillo() }
        producto.imageLlana.setOnClickListener{ llana() }
        producto.imageEspatula.setOnClickListener{ espatula() }
        producto.imageAccesorio.setOnClickListener{ accesorio() }
        producto.imageKit.setOnClickListener{ kit() }
        producto.imageGalon.setOnClickListener{ galon() }
        producto.imageWin.setOnClickListener{ win() }
        producto.imageGuante.setOnClickListener{ guante() }
        producto.imageNivel.setOnClickListener{ nivel() } */
    }

    /*  private fun brocha() {
         val ventanaBrocha = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaBrocha)
         Toast.makeText(applicationContext, "Brocha Pulsado", Toast.LENGTH_SHORT).show()
     }

     private fun rodillo() {
         val ventanaRodillo = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaRodillo)
         Toast.makeText(applicationContext, "Rodillo Pulsado", Toast.LENGTH_SHORT).show()
     }

     private fun llana() {
         val ventanaLlana = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaLlana)
         Toast.makeText(applicationContext, "Llana Pulsado", Toast.LENGTH_SHORT).show()
     }

     private fun espatula() {
         val ventanaEspatula = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaEspatula)
         Toast.makeText(applicationContext, "Espatula Pulsado", Toast.LENGTH_SHORT).show()
     }

     private fun accesorio() {
         val ventanaAccesorio = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaAccesorio)
         Toast.makeText(applicationContext, "Accesorio Pulsado", Toast.LENGTH_SHORT).show()
     }

     private fun kit() {
         val ventanaKit = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaKit)
         Toast.makeText(applicationContext, "Kit Pulsado", Toast.LENGTH_SHORT).show()
     }

     private fun galon() {
         val ventanaGalon = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaGalon)
         Toast.makeText(applicationContext, "Galon Pulsado", Toast.LENGTH_SHORT).show()
     }

     private  fun win() {
         val ventanaWin = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaWin)
         Toast.makeText(applicationContext, "Win Pulsado", Toast.LENGTH_SHORT).show()
     }

     private fun guante() {
         val ventanaGuante = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaGuante)
         Toast.makeText(applicationContext, "Guante Pulsado", Toast.LENGTH_SHORT).show()
     }

     private fun nivel() {
         val ventanaNivel = Intent(applicationContext, ProductsLineActivity::class.java)
         startActivity(ventanaNivel)
         Toast.makeText(applicationContext, "Nivel Pulsado", Toast.LENGTH_SHORT).show()
     }   */

    private fun initRecycleView() {
        adapter = ProductsAdapter(productsImages)
       producto.rvProductos.layoutManager = LinearLayoutManager(this)
        producto.rvProductos.adapter = adapter
    }

    /*-- Instancia de retrofit */
    private fun  getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breed/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    /*-- Corutina Nos envia los procesos a segundo plano*/
    private fun searchByName(query:String){
        CoroutineScope(Dispatchers.IO).launch {
            val  call = getRetrofit().create(APIService::class.java).getProducts("$query/images")
            val product = call.body()
            runOnUiThread {                         //---recupera y envia los datos al hilo principal
                if (call.isSuccessful) {  //--- pinta en el hilo principal
                    val images = product?.images ?: emptyList()
                    productsImages.clear()
                    productsImages.addAll(images)
                    adapter.notifyDataSetChanged()
                }else {
                    showError()
                }
                hideKeyboard()
            }
        }
    }
        //--- Nos oculta el teclado despues de hacer la busqueda
    private fun hideKeyboard() {
         val  imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(producto.viewProducts.windowToken, 0)
    }

    private fun showError() {
        Toast.makeText(this, "Ha ocurido un error", Toast.LENGTH_SHORT).show()
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (!query.isNullOrEmpty()){
            searchByName(query.toLowerCase())
        }
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        return true
    }
}