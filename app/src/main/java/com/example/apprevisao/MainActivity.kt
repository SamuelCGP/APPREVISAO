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
        var editText1 = findViewById<EditText>(R.id.editText1);
        var editText2 = findViewById<EditText>(R.id.editText2);
        var result = "Preencha os campos";

        if(!editText1.text.isNullOrEmpty() && !editText2.text.isNullOrEmpty()) {

            var value1 = Integer.parseInt(editText1.text.toString());
            var value2 = Integer.parseInt(editText2.text.toString());

            if (value1 == value2) {
                result = value1.toString() + " é igual a " + value2.toString();
            } else if (value1 > value2){
                result = value1.toString() + " é maior que " + value2.toString();
            } else{
                result = value1.toString() + " é menor que " + value2.toString();
            }

            editText1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            editText2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        }else{
            if(editText1.text.isNullOrEmpty()){
                editText1.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            }
            if(editText2.text.isNullOrEmpty()){
                editText2.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            }
        }
        
        textView.text = result;
    }

}
