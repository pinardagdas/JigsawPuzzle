package com.pinardagdas.jigsawpuzzle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ListActivity.this,SkyActivity.class);
                startActivity(intent);

            }
        });
        ImageButton kittenButton = (ImageButton) findViewById(R.id.kittenButton);
        kittenButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ListActivity.this,KittenActivity.class);
                startActivity(intent);

            }
        });
        ImageButton hallButton = (ImageButton) findViewById(R.id.hallButton);
        hallButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ListActivity.this,HallActivity.class);
                startActivity(intent);

            }
        });

    }


}
