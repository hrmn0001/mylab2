package com.example.mylab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgView;
        Switch sw;
        imgView = findViewById(R.id.flagview);
        sw = findViewById(R.id.spin_switch);

        sw.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(5000);
                rotate.setRepeatCount(Animation.INFINITE);
                rotate.setInterpolator(new LinearInterpolator());
                imgView.startAnimation(rotate);
            } else {
                imgView.clearAnimation();
            }
        });
    }
}