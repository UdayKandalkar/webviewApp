package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.demoapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;


    @Override



    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=activityMainBinding.getRoot();
        setContentView(view);
        activityMainBinding.gulambi.loadUrl("https://akshayjangid.works/");
        activityMainBinding.gulambi.getSettings().getJavaScriptEnabled();
    }
}