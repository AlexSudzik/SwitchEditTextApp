package com.example.switchedittextapp

import android.content.res.ColorStateList
import android.graphics.Color
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
                Iswitch.text = "off"
                imie.setTextColor(Color.parseColor("#69cc4b"))
                //#b01e1e
            }else{
                imie.setEnabled(true);
                Iswitch.text = "on"
                imie.setTextColor(Color.parseColor("#000000"))
            }
        })
        Nswitch?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked){
                nazwisko.setEnabled(false);
                Nswitch.text = "off"
                nazwisko.setTextColor(Color.parseColor("#69cc4b"))
            }else{
                nazwisko.setEnabled(true);
                Nswitch.text = "on"
                nazwisko.setTextColor(Color.parseColor("#000000"))
            }
        })

        Mswitch?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked){
                mail.setEnabled(false);
                Mswitch.text = "off"
                mail.setTextColor(Color.parseColor("#69cc4b"))
            }else{
                mail.setEnabled(true);
                Mswitch.text = "on"
                mail.setTextColor(Color.parseColor("#000000"))
            }
        })

        Wswitch?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked){
                wiek.setEnabled(false);
                Wswitch.text = "off"
                wiek.setTextColor(Color.parseColor("#69cc4b"))
            }else{
                wiek.setEnabled(true);
                Wswitch.text = "on"
                wiek.setTextColor(Color.parseColor("#000000"))
            }
        })

        Tswitch?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked){
                telefon.setEnabled(false);
                Tswitch.text = "off"
                telefon.setTextColor(Color.parseColor("#69cc4b"))
            }else{
                telefon.setEnabled(true);
                Tswitch.text = "on"
                telefon.setTextColor(Color.parseColor("#000000"))  
            }
        })







    }







}
