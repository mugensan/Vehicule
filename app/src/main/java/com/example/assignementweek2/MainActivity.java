package com.example.assignementweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // My variables
    private ImageView iv_pic_of_vehicule;
    private TextView tv_vehicule_info;
    private Button btn_choose_car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate variables
        iv_pic_of_vehicule = findViewById(R.id.iv_pic_of_vehicule);
        tv_vehicule_info = findViewById(R.id.tv_vehicule_info);
        btn_choose_car = findViewById(R.id.btn_choose_car);

        // Activate btn to next activity
        btn_choose_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transition();
            }


        });
    }

    // Methods for the activity transition
    private void transition() {

    }
}
