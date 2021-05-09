package com.smis935820.iniciokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            nombre()
        }

        btn2.setOnClickListener {
            rst()
        }
    }

    private fun nombre(){
        nombre.text="Josué Amílcar López Benítez"
    }

    private fun rst(){
        nombre.text="El contenido esta oculto"
    }
}