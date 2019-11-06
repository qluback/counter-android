package com.example.test

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var bMinus = findViewById<Button>(R.id.minus)
        bMinus.setOnClickListener { view ->
            var t = findViewById<EditText>(R.id.counterLabel)
            println("clicked")
            counter--;
            t.setText(counter.toString());
        }

        var bPlus = findViewById<Button>(R.id.plus)
        bPlus.setOnClickListener { view ->
            var t = findViewById<EditText>(R.id.counterLabel)
            println("clicked")
            counter++;
            t.setText(counter.toString());
        }

        var bDisplay = findViewById<Button>(R.id.display)
        bDisplay.setOnClickListener { view ->
            val intent = Intent(this, ResultActivity::class.java);
            intent.putExtra("counter", counter)
            startActivity(intent)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
