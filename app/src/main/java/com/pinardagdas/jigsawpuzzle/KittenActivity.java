package com.pinardagdas.jigsawpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class KittenActivity extends AppCompatActivity {
    private ImageButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12;
    private Button orj;
    private int kontrol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitten);

        r1=(ImageButton) findViewById(R.id.r1);
        r2=(ImageButton) findViewById(R.id.r2);
        r3=(ImageButton) findViewById(R.id.r3);
        r4=(ImageButton) findViewById(R.id.r4);
        r5=(ImageButton) findViewById(R.id.r5);
        r6=(ImageButton) findViewById(R.id.r6);

        r7=(ImageButton) findViewById(R.id.r7);
        r8=(ImageButton) findViewById(R.id.r8);
        r9=(ImageButton) findViewById(R.id.r9);
        r10=(ImageButton) findViewById(R.id.r10);
        r11=(ImageButton) findViewById(R.id.r11);
        r12=(ImageButton) findViewById(R.id.r12);


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
                kontrol=5;

            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol=6;

            }
        });


        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==1) {
                    r7.setImageResource(R.drawable.kitten1);
                }else {
                    Toast.makeText(KittenActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==2) {
                    r8.setImageResource(R.drawable.kitten2);
                }else {
                    Toast.makeText(KittenActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==3) {
                    r9.setImageResource(R.drawable.kitten3);
                }else {
                    Toast.makeText(KittenActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==4) {
                    r10.setImageResource(R.drawable.kitten4);
                }else{
                    Toast.makeText(KittenActivity.this,"Yanlış",Toast.LENGTH_SHORT).show();
                }
            }
        });
        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==5) {
                    r11.setImageResource(R.drawable.kitten5);
                }else{
                    Toast.makeText(KittenActivity.this,"Yanlış",Toast.LENGTH_SHORT).show();
                }
            }
        });
        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==6) {
                    r12.setImageResource(R.drawable.kitten6);
                }else{
                    Toast.makeText(KittenActivity.this,"Yanlış",Toast.LENGTH_SHORT).show();
                }
            }
        });
        orj= (Button)    findViewById(R.id.orj);
        orj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KittenActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

    }
}
