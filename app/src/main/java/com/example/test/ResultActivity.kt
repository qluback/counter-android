package com.example.test

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Get the Intent that started this activity and extract the string
        val result = intent.getIntExtra("counter", 0)
        print(result)
        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.result)
        textView.setText(result.toString())
        if(result <= 0) {
            textView.setTextColor(Color.parseColor("#ff0000"))
        }
        else if (result > 0 && result <= 5) {
            textView.setTextColor(Color.parseColor("#ffa500"))
        }
        else {
            textView.setTextColor(Color.parseColor("#008000"))
        }
    }
}
