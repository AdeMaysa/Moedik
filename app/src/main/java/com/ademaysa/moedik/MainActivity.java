package com.ademaysa.moedik;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String username = "ade";
    String password = "1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("LOGIN");

        EditText ade1 = findViewById(R.id.ade1);
        EditText ade2 = findViewById(R.id.ade2);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ade1.getText().toString().equalsIgnoreCase(username)&& ade2.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(MainActivity.this ,BerandaActivity.class));
                }else {
                    Toast.makeText(MainActivity.this,"username dan password tidak boleh kosong" , Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , RegisterActivity.class));
            }
        });
    }


}