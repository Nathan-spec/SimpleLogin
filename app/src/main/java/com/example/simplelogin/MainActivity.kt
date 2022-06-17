package com.example.simplelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        TextView username = (TextView)findViewById(R.id.username)
        TextView password = (TextView)findViewById(R.id.password)

        MaterialButton loginbtn = (MaterialButton)findViewById(R.id.loginbtn)

        loginbtn.setOnClickListener(new View.OnClickListener)
        {
            @Override
            public void onClick(View v)
            {

            }
        }
    }
}