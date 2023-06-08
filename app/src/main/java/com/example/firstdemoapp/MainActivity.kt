package com.example.firstdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonUpload = findViewById <Button>(R.id.btnupload)
        val buttonDownload = findViewById <Button>(R.id.btndownload)
        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext, "Uploading___", Toast.LENGTH_SHORT).show()
        }

            buttonDownload.setOnClickListener{
                Toast.makeText(applicationContext, "Downloading___", Toast.LENGTH_SHORT).show()
        }
    }
}