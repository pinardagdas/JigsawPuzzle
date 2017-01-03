package com.pinardagdas.jigsawpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HallActivity extends AppCompatActivity {
    private ImageButton r1, r2, r3, r4,r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18;
    private Button orj;
    private int kontrol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall);

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
        r13=(ImageButton) findViewById(R.id.r13);
        r14=(ImageButton) findViewById(R.id.r14);
        r15=(ImageButton) findViewById(R.id.r15);
        r16=(ImageButton) findViewById(R.id.r16);
        r17=(ImageButton) findViewById(R.id.r17);
        r18=(ImageButton) findViewById(R.id.r18);


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
                kontrol=7;
            }
        });
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol=8;
            }
        });
        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kontrol=9;
            }
        });


        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==1) {
                    r10.setImageResource(R.drawable.hall1);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==2) {
                    r11.setImageResource(R.drawable.hall2);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==3) {
                    r12.setImageResource(R.drawable.hall3);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==4) {
                    r13.setImageResource(R.drawable.hall4);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==5) {
                    r14.setImageResource(R.drawable.hall5);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==6) {
                    r15.setImageResource(R.drawable.hall6);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==7) {
                    r16.setImageResource(R.drawable.hall7);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==8) {
                    r17.setImageResource(R.drawable.hall8);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kontrol==9) {
                    r18.setImageResource(R.drawable.hall9);
                }else {
                    Toast.makeText(HallActivity.this, "Yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
        orj= (Button)    findViewById(R.id.orj);
        orj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HallActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });



    }
}
