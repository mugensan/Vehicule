package com.example.assignementweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class VehiculeChoice extends AppCompatActivity {

    //Variables
    private Button btn_ferrari;
    private Button btn_aston_martin;
    private Button btn_ktm;
    private Button btn_yamaha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicule_choice);
    }
}
