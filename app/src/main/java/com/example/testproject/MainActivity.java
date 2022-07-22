package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void SendNow(View view){
        Toast.makeText(this, "Sending data.....", Toast.LENGTH_SHORT).show();
    }
    public void ReceiveNow(View view){
        Toast.makeText(this, "Receiving data.....", Toast.LENGTH_SHORT).show();
    }
    public void DeleteNow(View view){
        Toast.makeText(this, "Deleting data.....", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}