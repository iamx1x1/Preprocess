package com.example.mandyyang.preprocessing;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    //MEAN_BLUR
    public static final int MEAN_BLUR=1;
    //GAUSSIAN_BLUR
    public static final int GAUSSIAN_BLUR=2;
    //MEDIAN_BLUR
    public static final int MEDIAN_BLUR=3;
    //SHARPEN
    public static final int SHARPEN = 4;
    //THRESHOLD
    public static final int THRESHOLD = 7;
    // ADAPTIVE_THRESHOLD
    public static final int ADAPTIVE_THRESHOLD = 8;
    //DILATE
    public static final int DILATE = 5;
    //ERODE
    public static final int ERODE = 6;
    //Opening
    public static final int Opening = 9;
    //Closing
    public static final int Closing = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //bMean
        Button bMean;
        bMean = (Button) findViewById(R.id.bMean);
        bMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", MEAN_BLUR);
                startActivity(i);
            }
        });

        //bGassian1
        Button bGassian;
        bGassian = (Button) findViewById(R.id.bGassian);
        bGassian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", GAUSSIAN_BLUR);
                startActivity(i);
            }
        });

        //bMedian
        Button bMedian = (Button) findViewById(R.id.bMedian);
        bMedian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", MEDIAN_BLUR);
                startActivity(i);
            }
        });


        //SHARPEN
        Button bSharpen;
        bSharpen = (Button) findViewById(R.id.bSharpen);
        bSharpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", SHARPEN);
                startActivity(i);
            }
        });

        //THRESHOLD
        Button bThreshold;
        bThreshold = (Button) findViewById(R.id.bThreshold);
        bThreshold.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", THRESHOLD);
                startActivity(i);
            }
        });
//bAdaptiveThreshold
        Button bAdaptiveThreshold;
        bAdaptiveThreshold = (Button) findViewById(R.id.bAdaptiveThreshold);
        bAdaptiveThreshold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", ADAPTIVE_THRESHOLD);
                startActivity(i);
            }
        });


        //DILATE
        Button bDilate;
        bDilate = (Button) findViewById(R.id.bDilate);
        bDilate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", DILATE);
                startActivity(i);
            }
        });

   //Erode

        Button bErode;
        bErode = (Button) findViewById(R.id.bErode);
        bErode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", ERODE);
                startActivity(i);
            }
        });

    //Closing
        Button bClosing;
        bClosing = (Button) findViewById(R.id.bClosing);
        bClosing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", Closing);
                startActivity(i);
            }
        });

        //Opening
        Button bOpening;
        bOpening = (Button) findViewById(R.id.bOpening);
        bOpening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", Opening);
                startActivity(i);
            }
        });



    }

}
