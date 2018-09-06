package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton=findViewById(R.id.ask_button);

        final ImageView static_Image=findViewById(R.id.image_ball1);

        final int[] magicarray={R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random g= new Random();
                int n=g.nextInt(3);
                static_Image.setImageResource(magicarray[n]);
            }
        });




    }
}
