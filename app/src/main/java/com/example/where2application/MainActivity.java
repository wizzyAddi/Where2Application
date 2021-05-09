package com.example.where2application;
//NB: DO NOT EDIT THIS DOCUMENT
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,AccessActivity.class);
                startActivity(intent);
                finish();//https://abhiandroid.com/programming/splashscreen
            }
        },3000);
    }
}
//NB: DO NOT EDIT THIS DOCUMENT