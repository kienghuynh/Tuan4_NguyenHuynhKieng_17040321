package com.example.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SendingData {

    TextView tvThanhTienMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvThanhTienMain = findViewById(R.id.tvThanhTienMain);
    }
    public void sendData(String data){
        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
    }
}