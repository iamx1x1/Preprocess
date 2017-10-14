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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //bMean
        Button bMean;
        bMean = (Button)findViewById(R.id.bMean);
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

        bGassian = (Button)findViewById(R.id.bGassian);
        bGassian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", GAUSSIAN_BLUR);
                startActivity(i);
            }
        });

    //bMedian
        Button bMedian = (Button)findViewById(R.id.bMedian);
        bMedian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class); i.putExtra("ACTION_MODE", MEDIAN_BLUR);
                startActivity(i);
            } });


     //SHARPEN
        Button bSharpen;
        bSharpen = (Button)findViewById(R.id.bSharpen); bSharpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class); i.putExtra("ACTION_MODE", SHARPEN);
                startActivity(i);
            } });

    }
}
