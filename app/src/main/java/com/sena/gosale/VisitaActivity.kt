package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TableLayout
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException

class VisitaActivity : AppCompatActivity() {
    var tbVisit: TableLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visita)

        tbVisit=findViewById(R.id.tbVisit)
        tbVisit?.removeAllViews()

        var queue= Volley.newRequestQueue(this)
        var url="http://192.168.1.76/PruebaGoSale/index.php"

        var jsonObjectResquest= JsonObjectRequest(Request.Method.GET,url,null,
            Response.Listener { response ->
                try {
                    var jsonArray=response.getJSONArray("data")
                    for (i in 0 until jsonArray.length()){
                        var jsonObject=jsonArray.getJSONObject(i)
                        val registro=LayoutInflater.from(this).inflate(R.layout.row_client_visit,null,false)
                        val nameClientVisit=registro.findViewById<View>(R.id.nameClientVisit) as TextView
                        val colVisit=registro.findViewById<View>(R.id.colVisit)
                        nameClientVisit.text=jsonObject.getString("name")
                        colVisit.id=jsonObject.getString("id").toInt()
                        tbVisit?.addView(registro)

                    }
                }catch (e: JSONException){
                    e.printStackTrace()
                }

            }, Response.ErrorListener { error ->

            })
        queue.add(jsonObjectResquest)
    }
    fun clickTablaMostrarV(view: View){
        Toast.makeText(this, view.id.toString(), Toast.LENGTH_SHORT).show()
    }
}