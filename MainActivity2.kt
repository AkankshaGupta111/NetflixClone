<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000"
    android:padding="20dp">

    <!-- Netflix Title -->
    <TextView
        android:id="@+id/tvNetflix"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="NETFLIX"
        android:textSize="80sp"
        android:textStyle="bold"
        android:textColor="#E50914"
        android:layout_centerHorizontal="true"
         />

    <!-- Sign In Text -->
    <TextView
        android:id="@+id/tvSignIn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Sign In"
        android:textSize="50sp"
        android:textColor="#FFFFFF"
        android:layout_below="@id/tvNetflix"
        android:layout_marginTop="30dp"
         />

    <!-- Username EditText -->
    <EditText
        android:id="@+id/etUsername"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:hint="Your Name - Registration Number"
        android:background="#222222"
        android:textColor="#FFFFFF"
        android:textColorHint="#888888"
        android:padding="10dp"
        android:layout_below="@id/tvSignIn"
        android:layout_marginTop="40dp" />

    <!-- Password EditText -->
    <EditText
        android:id="@+id/etPassword"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:hint="Enter Password"
        android:background="#222222"
        android:textColor="#FFFFFF"
        android:textColorHint="#888888"
        android:padding="10dp"
        android:inputType="textPassword"
        android:layout_below="@id/etUsername"
        android:layout_marginTop="20dp" />

    <!-- Sign In Button -->
    <Button
        android:id="@+id/btnLogin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sign In"
        android:background="#E50914"
        android:textColor="#FFFFFF"
        android:layout_below="@id/etPassword"
        android:layout_marginTop="30dp"
        android:layout_alignParentStart="true" />

    <!-- Fingerprint icon -->
    <ImageView
        android:id="@+id/imgFinger"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:src="@drawable/finger"
        android:layout_alignTop="@id/btnLogin"
        android:layout_toEndOf="@id/btnLogin"
        android:layout_marginStart="20dp" />

    <!-- Output TextView -->
    <TextView
        android:id="@+id/tvOutput"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        android:layout_below="@id/btnLogin"
        android:layout_marginTop="30dp" />

</RelativeLayout>

KOTLIN

package com.example.caxml

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val username = findViewById<EditText>(R.id.etUsername)
        val password = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val output = findViewById<TextView>(R.id.tvOutput)

        btnLogin.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()

            output.text = "Username: $user\nPassword: $pass"
        }
    }
}
