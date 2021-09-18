package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException

class ClientesActivity : AppCompatActivity() {

    var tbClient:TableLayout?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientes)

        tbClient=findViewById(R.id.tbClient)
        tbClient?.removeAllViews()

        //botonPasar.setOnClickListener{
        //    val ventanaPasar = Intent(this, ClientesInformacionActivity::class.java)
        //    startActivity(ventanaPasar)
        //}
        var queue= Volley.newRequestQueue(this)
        var url="http://192.168.1.76/PruebaGoSale/index.php"

        var jsonObjectResquest=JsonObjectRequest(Request.Method.GET,url,null,
            Response.Listener { response ->
                try {
                    var jsonArray=response.getJSONArray("data")
                    for (i in 0 until jsonArray.length()){
                        var jsonObject=jsonArray.getJSONObject(i)
                        val registro=LayoutInflater.from(this).inflate(R.layout.row_client,null,false)
                        val colName=registro.findViewById<View>(R.id.colName) as TextView
                        val colPhone=registro.findViewById<View>(R.id.colPhone) as TextView
                        //val mostrarRow=registro.findViewById<View>(R.id.colRow)
                        val colDelete=registro.findViewById<View>(R.id.colDelete)
                        colName.text=jsonObject.getString("name")
                        colPhone.text=jsonObject.getString("phone")
                        //colRow.id=jsonObject.getString("id").toInt()
                        colDelete.id=jsonObject.getString("id").toInt()
                        tbClient?.addView(registro)

                    }
                }catch (e: JSONException){
                    e.printStackTrace()
                }

            },Response.ErrorListener { error ->

            })
        queue.add(jsonObjectResquest)
    }


    fun clickTablaMostrar(view: View){
        Toast.makeText(this, view.id.toString(), Toast.LENGTH_SHORT).show()
    }
    fun clickTablaDelete(view: View){
        Toast.makeText(this, view.id.toString(), Toast.LENGTH_SHORT).show()
    }
}