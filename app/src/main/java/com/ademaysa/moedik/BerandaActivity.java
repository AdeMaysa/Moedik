package com.ademaysa.moedik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BerandaActivity extends AppCompatActivity {

    private Object Menu;
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opsi, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.about:
                Toast.makeText(this, "opsi isi masih dalam pengembangan", Toast.LENGTH_LONG).show();
                break;

        }
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        ImageView imgbus1 = findViewById(R.id.imgbus1);
        Button btnout = findViewById(R.id.btnout);
        ImageView imgpesawat = findViewById(R.id.imgpesawat);
        ImageView imgriwayat = findViewById(R.id.imgriwayat);
        ImageView imgprofil = findViewById(R.id.imgProfil);


        imgbus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BerandaActivity.this , BookingBusActivity.class));

            }
        });

        btnout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        AlertDialog dialog = new AlertDialog.Builder(BerandaActivity.this)
                                .setTitle("Anda yakin ingin keluar ?")
                                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        finish();
                                    }
                                })
                                .setNegativeButton("Tidak", null)
                                .create();
                        dialog.show();
                    }
                });
        imgpesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(BerandaActivity.this)
                        .setTitle("Fitur ini masih dalam pengembangan")
                        .create();
                dialog.show();
            }
        });

        imgriwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(BerandaActivity.this)
                        .setTitle(("maaf fitur ini belum bisa diakses untuk saat ini"))
                        .create();
                dialog.show();
            }
        });
        imgprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(BerandaActivity.this)
                        .setTitle(("maaf fitur ini masih dalam pengembangan"))
                        .create();
                dialog.show();
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


