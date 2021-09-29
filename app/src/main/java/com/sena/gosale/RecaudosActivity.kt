package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException

class RecaudosActivity : AppCompatActivity() {

    var tbRecaudo:TableLayout?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos)

        tbRecaudo=findViewById(R.id.tbRecaudo)
        tbRecaudo?.removeAllViews()

        MyToolbar().show(this, "Recaudos", true)
        //val recaudo = findViewById<Button>(R.id.btnRecaudo)

        //recaudo.setOnClickListener(){
        //    val ventanaRecaudos = Intent(this, RecaudosActivity2::class.java)
        //    startActivity(ventanaRecaudos)
        //}
        var queue= Volley.newRequestQueue(this)
        var url="http://192.168.1.76/PruebaGoSale/recaudo/index.php"

        var jsonObjectResquest=JsonObjectRequest(Request.Method.GET,url,null,
            Response.Listener { response ->
                try {
                    var jsonArray=response.getJSONArray("data")
                    for (i in 0 until jsonArray.length()){
                        var jsonObject=jsonArray.getJSONObject(i)
                        val registro=LayoutInflater.from(this).inflate(R.layout.row_client_recaudo,null,false)
                        val nameClient=registro.findViewById<View>(R.id.nameClient) as TextView
                        val collect_status=registro.findViewById<View>(R.id.collect_status) as TextView
                        val method_payment=registro.findViewById<View>(R.id.method_payment) as TextView
                        val collect_date=registro.findViewById<View>(R.id.collect_date) as TextView
                        val colRecaudo=registro.findViewById<View>(R.id.colRecaudo)
                        nameClient.text=jsonObject.getString("user_id")
                        collect_status.text=jsonObject.getString("status")
                        method_payment.text=jsonObject.getString("method_of_payment")
                        collect_date.text=jsonObject.getString("date")
                        colRecaudo.id=jsonObject.getString("id").toInt()
                        tbRecaudo?.addView(registro)

                    }
                }catch (e: JSONException){
                    e.printStackTrace()
                }
            },Response.ErrorListener { error ->

            })
        queue.add(jsonObjectResquest)
    }

    fun clickRecaudoMostrar(view: View){
        Toast.makeText(this, view.id.toString(), Toast.LENGTH_SHORT).show()
    }
    fun clickTablaDelete(view: View){
        Toast.makeText(this, view.id.toString(), Toast.LENGTH_SHORT).show()
    }
}