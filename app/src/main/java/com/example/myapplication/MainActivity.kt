package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnAdd : Button
    lateinit var btnsous : Button
    lateinit var btnmul : Button
    lateinit var btnDiv : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var Result : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnmul = findViewById(R.id.btn_mul)
        btnsous = findViewById(R.id.btn_sous)
        btnDiv = findViewById(R.id.btn_div)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        Result = findViewById(R.id.text_result)

        btnAdd.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btnsous.setOnClickListener(this)
        btnDiv.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add -> {result=a+b}
            R.id.btn_sous ->{result=a-b}
            R.id.btn_mul -> {result=a*b}
            R.id.btn_div ->{result=a/b}
        }
        Result.text = "result is $result"
    }
}