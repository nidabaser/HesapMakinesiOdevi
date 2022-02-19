package com.example.hesapmakinesiodevi

import android.R.string
import android.os.Bundle
import android.text.TextUtils.split
import androidx.appcompat.app.AppCompatActivity
import com.example.hesapmakinesiodevi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityMainBinding.inflate(layoutInflater)

        setContentView(tasarim.root)

        tasarim.textViewSonuc.text = ""

        tasarim.button0.setOnClickListener { tasarim.textViewSonuc.append("0") }
        tasarim.button1.setOnClickListener { tasarim.textViewSonuc.append("1") }
        tasarim.button2.setOnClickListener { tasarim.textViewSonuc.append("2") }
        tasarim.button3.setOnClickListener { tasarim.textViewSonuc.append("3") }
        tasarim.button4.setOnClickListener { tasarim.textViewSonuc.append("4") }
        tasarim.button5.setOnClickListener { tasarim.textViewSonuc.append("5") }
        tasarim.button6.setOnClickListener { tasarim.textViewSonuc.append("6") }
        tasarim.button7.setOnClickListener { tasarim.textViewSonuc.append("7") }
        tasarim.button8.setOnClickListener { tasarim.textViewSonuc.append("8") }
        tasarim.button9.setOnClickListener { tasarim.textViewSonuc.append("9") }
        tasarim.btnTemizle.setOnClickListener { tasarim.textViewSonuc.text = "" }
        tasarim.btnToplama.setOnClickListener { tasarim.textViewSonuc.append("+") }

        tasarim.btnSonuc.setOnClickListener {
            val string = tasarim.textViewSonuc.text.toString()
            val str = string.split("+")
            var top = 0
            for(i in 0 until str.size){
                top += str[i].toInt()
            }
            tasarim.textViewSonuc.text = top.toString()
        }
    }
}