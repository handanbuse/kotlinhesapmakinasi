package com.example.kotlinhesapmakinasi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinhesapmakinasi.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

var numara1: Double? =null
var numara2:Double?=null
var sonuc:Double?=null


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    fun topla(view:View){
        // numara 1 ve numara 2 dönüşümü yap
        numara1= binding.editTextText.text.toString().toDoubleOrNull()
        numara2= binding.editTextText2.text.toString().toDoubleOrNull()

        if (numara1 !=null && numara2 !=null){
            sonuc= numara1!! + numara2!!
            binding.textView.text="sonuc: ${sonuc}"
        }else{
            binding.textView.text="numara giriniz"


        }
    }
    fun bol(view:View){
        // numara 1 ve numara 2 dönüşümü yap
        numara1= binding.editTextText.text.toString().toDoubleOrNull()
        numara2= binding.editTextText2.text.toString().toDoubleOrNull()

        if (numara1 !=null && numara2 !=null){
            sonuc= numara1!! / numara2!!
            binding.textView.text="sonuc: ${sonuc}"
        }else{
            binding.textView.text="numara giriniz"


        }
    }
    fun carp(view:View){
        // numara 1 ve numara 2 dönüşümü yap
        numara1= binding.editTextText.text.toString().toDoubleOrNull()
        numara2= binding.editTextText2.text.toString().toDoubleOrNull()

        if (numara1 !=null && numara2 !=null){
            sonuc= numara1!! * numara2!!
            binding.textView.text="sonuc: ${sonuc}"
        }else{
            binding.textView.text="numara giriniz"


        }
    }
    fun cıkar(view:View){
        // numara 1 ve numara 2 dönüşümü yap
        numara1= binding.editTextText.text.toString().toDoubleOrNull()
        numara2= binding.editTextText2.text.toString().toDoubleOrNull()

        if (numara1 !=null && numara2 !=null){
            sonuc= numara1!! - numara2!!
            binding.textView.text="sonuc: ${sonuc}"
        }else{
            binding.textView.text="numara giriniz"


        }
    }
}