package com.example.practicaep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "Android","Iphone","Windows Phone", "Blackberry","Firefox Os","Amazon World","Nokia","3","4","5","3","10","21","21","34","3","34","222","231"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val lsvSistemasOperativos: ListView = findViewById<View>(R.id.LsvSO) as ListView
        val adaptador: Any? =
            ArrayAdapter<Any>(this,android.R.layout.simple_list_item_1,arrSO)

        lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        lsvSistemasOperativos.setOnItemClickListener{parent,view,position,id->
            Toast.makeText(
                applicationContext,
                "Posición:$position" ,
                Toast.LENGTH_LONG
            ).show()

        }
    }
}