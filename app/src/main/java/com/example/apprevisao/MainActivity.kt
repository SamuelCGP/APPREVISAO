package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun compare(view: View) {
        var textView = findViewById<TextView>(R.id.textView1);
        var result = "Preencha os campos";

        if(!findViewById<EditText>(R.id.editText1).text.isNullOrEmpty() && !findViewById<EditText>(R.id.editText2).text.isNullOrEmpty()) {
            var editText1 = findViewById<EditText>(R.id.editText1).text;
            var editText2 = findViewById<EditText>(R.id.editText2).text;

            var value1 = Integer.parseInt(findViewById<EditText>(R.id.editText1).text.toString());
            var value2 = Integer.parseInt(findViewById<EditText>(R.id.editText2).text.toString());

            if (value1 == value2) {
                result = value1.toString() + " é igual a " + value2.toString();
            } else if (value1 > value2){
                result = value1.toString() + " é maior que " + value2.toString();
            } else{
                result = value1.toString() + " é menor que " + value2.toString();
            }

            findViewById<EditText>(R.id.editText1).setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            findViewById<EditText>(R.id.editText2).setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        }else{
            if(findViewById<EditText>(R.id.editText1).text.isNullOrEmpty()){
                findViewById<EditText>(R.id.editText1).setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            }
            if(findViewById<EditText>(R.id.editText2).text.isNullOrEmpty()){
                findViewById<EditText>(R.id.editText2).setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            }
        }
        
        textView.text = result;
    }

}
