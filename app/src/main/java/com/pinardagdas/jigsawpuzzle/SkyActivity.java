package com.pinardagdas.jigsawpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class SkyActivity extends AppCompatActivity {
    private ImageButton r1, r2, r3, r4, r5, r6, r7, r8;
    private Button      orj;
    private  int      kontrol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sky);

        r1=(ImageButton) findViewById(R.id.r1);
        r2=(ImageButton) findViewById(R.id.r2);
        r3=(ImageButton) findViewById(R.id.r3);
        r4=(ImageButton) findViewById(R.id.r4);

        r5=(ImageButton) findViewById(R.id.r5);
        r6=(ImageButton) findViewById(R.id.r6);
        r7=(ImageButton) findViewById(R.id.r7);
        r8=(ImageButton) findViewById(R.id.r8);

        r1.setImageResource(R.drawable.image1kucuk);
        r2.setImageResource(R.drawable.image2kucuk);
        r3.setImageResource(R.drawable.image3kucuk);
        r4.setImageResource(R.drawable.image4kucuk);

        //r5.setImageResource(R.drawable.androidlogo);
        //r6.setImageResource(R.drawable.androidlogo);
        //r7.setImageResource(R.drawable.androidlogo);
        //r8.setImageResource(R.drawable.androidlogo);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol=1;
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol=2;

            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol=3;

            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol=4;

            }
        });


        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==1) {
                    r5.setImageResource(R.drawable.image1);
                }else {
                    Toast.makeText(SkyActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==2) {
                    r6.setImageResource(R.drawable.image2);
                }else {
                    Toast.makeText(SkyActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==3) {
                    r7.setImageResource(R.drawable.image3);
                }else {
                    Toast.makeText(SkyActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==4) {
                    r8.setImageResource(R.drawable.image4);
                }else{
                    Toast.makeText(SkyActivity.this,"Yanlış",Toast.LENGTH_SHORT).show();
                }
            }
        });
        orj= (Button)    findViewById(R.id.orj);
        orj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SkyActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

    }
}

