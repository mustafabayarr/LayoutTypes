package com.mustafabayar.layouttypes_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Izmir extends AppCompatActivity {
    ImageView imageView;
    ImageButton imageButtonLeft, imageButtonRight;
    TextView titleText,licensePlateText,descText;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izmir);

        imageView = findViewById(R.id.imageView);
        imageButtonLeft = findViewById(R.id.imageButtonLeft);
        imageButtonRight = findViewById(R.id.imageButtonRight);
        titleText = findViewById(R.id.titleText);
        licensePlateText = findViewById(R.id.licensePlateText);
        descText = findViewById(R.id.descText);

    }

    public void changeRight(View view){
        imageButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getApplicationContext(),Mardin.class);
                startActivity(intent);
            }
        });
    }

    public void changeLeft(View view){
        imageButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}