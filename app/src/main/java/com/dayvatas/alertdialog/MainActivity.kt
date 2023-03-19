package com.dayvatas.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.dayvatas.alertdialog.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        Toast.makeText(applicationContext, "Welcome to the machine!", Toast.LENGTH_LONG).show()
    }
    
    fun save (view : View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("Yes"){dialog, which ->
            Toast.makeText(applicationContext, "As you wish", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No"){dialog, which ->
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}