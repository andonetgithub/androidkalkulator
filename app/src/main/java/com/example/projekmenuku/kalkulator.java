package com.example.projekmenuku;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class kalkulator extends AppCompatActivity {
    //Deklarasi Objek ke Variabel
    EditText etangka1, etangka2;
    Button btambah, bkurang, bkali, bbagi, bbersih;
    TextView thasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Memanggil View di Layout dan Menerapkan di Variabel
        // yang bertipe objek yang sama
        etangka1 = findViewById(R.id.edangka1);
        etangka2 = findViewById(R.id.edangka2);
        btambah = findViewById(R.id.btntambah);
        bkurang = findViewById(R.id.btnkurang);
        bkali = findViewById(R.id.btnkali);
        bbagi = findViewById(R.id.btnbagi);
        bbersih = findViewById(R.id.btnbersih);
        thasil = findViewById(R.id.txthasil);

        btambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Isi kode disini
                if((etangka1.getText().length()>0) && (etangka2.getText().length()>0)) {
                  double a1 = Double.parseDouble(etangka1.getText().toString());
                  double a2 = Double.parseDouble(etangka2.getText().toString());
                  double result = a1 + a2;
                  thasil.setText(Double.toString(result));

                } else{
                    Toast.makeText(kalkulator.this, "Angka1 dan Angka2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((etangka1.getText().length()>0) && (etangka2.getText().length()>0)) {
                    double a1 = Double.parseDouble(etangka1.getText().toString());
                    double a2 = Double.parseDouble(etangka2.getText().toString());
                    double result = a1 - a2;
                    thasil.setText(Double.toString(result));

                } else{
                    Toast.makeText(kalkulator.this, "Angka1 dan Angka2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((etangka1.getText().length()>0) && (etangka2.getText().length()>0)) {
                    double a1 = Double.parseDouble(etangka1.getText().toString());
                    double a2 = Double.parseDouble(etangka2.getText().toString());
                    double result = a1 * a2;
                    thasil.setText(Double.toString(result));

                } else{
                    Toast.makeText(kalkulator.this, "Angka1 dan Angka2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((etangka1.getText().length()>0) && (etangka2.getText().length()>0)) {
                    double a1 = Double.parseDouble(etangka1.getText().toString());
                    double a2 = Double.parseDouble(etangka2.getText().toString());
                    double result = a1 / a2;
                    thasil.setText(Double.toString(result));

                } else{
                    Toast.makeText(kalkulator.this, "Angka1 dan Angka2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bbersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etangka1.setText("");
                etangka2.setText("");
                thasil.setText("0");
                etangka1.requestFocus();
            }
        });

    }
}