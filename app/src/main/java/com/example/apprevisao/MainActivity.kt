package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun compare(view: View) {
        var textView = findViewById<TextView>(R.id.textView1);
        var value1 = Integer.parseInt(findViewById<EditText>(R.id.editText1).text.toString());
        var value2 = Integer.parseInt(findViewById<EditText>(R.id.editText2).text.toString());
        var result = "";

        if (value1 == value2) {
            result = "Campo 1 é igual ao Campo 2";
        } else if (value1 > value2){
            result = "Campo 1 é maior que o Campo 2";
        } else{
            result = "Campo 1 é menor que o Campo 2";
        }

        textView.text = result;
    }

}