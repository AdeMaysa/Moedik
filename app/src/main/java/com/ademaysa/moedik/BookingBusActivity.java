package com.ademaysa.moedik;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BookingBusActivity extends AppCompatActivity {
    EditText waktu;
    RadioGroup  RadioGroup1, RadioGroup2, RadioGroup3, RadioGroup4;
    RadioButton rb11,rb22,rb33,rb44;
    Button Booking;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_bus);
        RadioGroup1 = findViewById(R.id.rg1);
        RadioGroup2 = findViewById(R.id.rg2);
        waktu = findViewById(R.id.perjalanan);
        RadioGroup3 = findViewById(R.id.rg3);
        RadioGroup4 = findViewById(R.id.rg4);

        Booking = findViewById(R.id.bkskrg);
        Booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radiod = RadioGroup1.getCheckedRadioButtonId();
                int radioa = RadioGroup2.getCheckedRadioButtonId();
                int radioe = RadioGroup3.getCheckedRadioButtonId();
                int radiom = RadioGroup4.getCheckedRadioButtonId();
                rb11 = (RadioButton) findViewById(radiod);
                rb22 =(RadioButton) findViewById(radioa);
                rb33 = (RadioButton) findViewById(radioe);
                rb44 = (RadioButton) findViewById(radiom);
                Intent i = new Intent(BookingBusActivity.this, RiwayatActivity.class);
                i.putExtra("Asal : ", rb11.getText().toString());
                i.putExtra("Tujuan : " , rb22.getText().toString());
                i.putExtra("Dewasa : " , rb33.getText().toString());
                i.putExtra("Anak-anak : " , rb44.getText().toString());
                i.putExtra("Waktu Perjalanan : ",waktu.getText().toString());

                startActivity(i);


            }

        });

        ActionBar menu = getSupportActionBar();
        menu.setDefaultDisplayHomeAsUpEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return(true);

    }
}

