package com.example.practicaep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.app.assist.AssistStructure
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
class Divisas : AppCompatActivity() {
    private var EditText cantidad;
    private var CheckBox Dol, eur;
    private var TextView textView8;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_divisas)

        cantidad = (EditText) findViewById (R.id.cantidad)
        Dol =(CheckBox)findViewById(R.id.Dol);
        eur =(CheckBox)findViewByID(R.id.eur);
        textView8 = (TextView)findViewById(R.id.textView8)

    }
    override fun cal(view: View){

        String valor2_String = can.getText().toString();
        int valor2_int = Integer.parseInt(valor2_String);

        String resultado = "";
        if(dol.isChecked()==true) {
            int dolar = valor2_int /20;
            resultado = "Los dolars son:" + dolar + "/";
        }
        if(eur.isChecked()==true){
            double euro = valor2_int*0.05;
            resultado = resultado +"Los euros son:"+euro;
        }
        textView8.setText(resultado);

    }
}