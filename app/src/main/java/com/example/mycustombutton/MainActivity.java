package com.example.mycustombutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2;
    Animation anim1,anim2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        anim1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.upperanim);

        anim2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.loweranim);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.startAnimation(anim1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.startAnimation(anim2);
            }
        });

    }
}