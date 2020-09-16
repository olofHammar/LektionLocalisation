package com.example.lektionlocalisation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
lateinit var greeting: TextView
var name: String = "Olle"
var age: Int = 10
//Lägger till lite kommentarer.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greeting = findViewById(R.id.tv_greeting)

    }

    fun testFunction () {

        //Lägger in en kommentar här

    }

    fun btnPressed (v: View) {
        //För att lägga in en placeholder i strängen används %1$s för string (1 betyder att det är första placeholdern och
        //skrivs %2$s om det ska läggas till en till placeholder i samma sträng. Här nedan skickar vi med name som
        //placeholder.
        greeting.text = getString(R.string.great, name)
    }
}

//Anpassa appen till svenska och engelska
//1. Anpassa XML
//2.Anpassa Kotlin-filer
//3.Anpassa bilder