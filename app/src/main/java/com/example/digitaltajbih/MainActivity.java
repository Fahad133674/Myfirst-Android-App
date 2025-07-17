package com.example.digitaltajbih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvcount;
    Button buttonadd, buttonsub,buttonreset, buttonNext;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvcount = findViewById(R.id.textView);
        buttonadd = findViewById(R.id.buttonAdd);
        buttonsub = findViewById(R.id.buttonSub);
        buttonreset = findViewById(R.id.buttonReset);
        buttonNext = findViewById(R.id.gotonextpage1to2);

        //=================================================================
        //button add
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count=count+1;
                tvcount.setText(""+count);
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count-1;
                tvcount.setText(""+count);
            }
        });
        buttonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                tvcount.setText(""+count);
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity2.class); //intent use kora hoy ek activity theke arek activity te jaoar jonno..
                // syntx holo Intent intent_name = new Intent(from_activity,to_activity);
                startActivity(myIntent);
                //call korar niyom holo startActivity(intent_name)
            }
        });

    }
}