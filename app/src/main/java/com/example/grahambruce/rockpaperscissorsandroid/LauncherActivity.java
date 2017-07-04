package com.example.grahambruce.rockpaperscissorsandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void onStartButtonClicked(View button){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
