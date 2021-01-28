package com.example.loginv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button5;
    private Button button;
   private TextView textview5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        button5 = (Button) findViewById(R.id.button5);
        button = (Button) findViewById(R.id.button);
        textview5 = (TextView) findViewById(R.id.textview5);
        
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinscription();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openprofil();
            }
        });
        textview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinscription();
            }
        });





    }
    public void openinscription()
    {
        Intent intent = new Intent(this, inscription.class);
        startActivity(intent);

    }

    public void openprofil()
    {
        Intent intent = new Intent(this, profil.class);
        startActivity(intent);
    }

}