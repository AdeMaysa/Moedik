package com.ademaysa.moedik;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RiwayatActivity extends AppCompatActivity {
private TextView result;



    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        String RadioGroup1 = getIntent().getExtras().getString("Asal : ");
        result = findViewById(R.id.tv1);
        result.setText("Asal : "+RadioGroup1);

        String RadioGroup2 = getIntent().getExtras().getString("Tujuan : ");
        result= findViewById(R.id.tv2);
        result.setText("Tujuan : " + RadioGroup2);

        String RadioGroup3 = getIntent().getExtras().getString("Dewasa : ");
        result = findViewById(R.id.tv3);
        result.setText("Dewasa : " +RadioGroup3);

        String RadioGroup4 = getIntent().getExtras().getString("Anak-anak : ");
        result = findViewById(R.id.tv4);
        result.setText("Anak-anak : "+ RadioGroup4);

        String waktu = getIntent().getExtras().getString("Waktu Perjalanan : ");
        result = findViewById(R.id.tv5);
        result.setText("Waktu Perjalanan : "+waktu);





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