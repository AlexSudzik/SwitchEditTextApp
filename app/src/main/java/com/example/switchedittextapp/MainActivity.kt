package com.example.switchedittextapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imie = findViewById(R.id.imie) as EditText
        var nazwisko = findViewById(R.id.nazwisko) as EditText
        var mail = findViewById(R.id.mail) as EditText
        var wiek = findViewById(R.id.wiek) as EditText
        var telefon = findViewById(R.id.telefon) as EditText

        var Iswitch = findViewById(R.id.Iswitch) as Switch
        var Nswitch = findViewById(R.id.Nswitch) as Switch
        var Mswitch = findViewById(R.id.Mswitch) as Switch
        var Wswitch = findViewById(R.id.Wswitch) as Switch
        var Tswitch = findViewById(R.id.Tswitch) as Switch

        Iswitch?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked){
                imie.setEnabled(false);
            }else{
                imie.setEnabled(true);
            }


            /*
             val message = if (isChecked) "Switch2:ON" else "Switch2:OFF"
             Toast.makeText(this@MainActivity, message,
                Toast.LENGTH_SHORT).show()*/
        })






    }







}
