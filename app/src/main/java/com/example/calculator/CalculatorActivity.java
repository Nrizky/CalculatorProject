package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{


    private Button btnJumlah, btnKurang, btnKali, btnBagi;
    private TextView tvHasil;
    private EditText etAngka1, etAngka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etAngka1 = findViewById(R.id.et_angka1);
        etAngka2 = findViewById(R.id.et_angka2);
        btnJumlah = findViewById(R.id.btn_jumlah);
        btnKurang = findViewById(R.id.btn_kurang);
        btnKali = findViewById(R.id.btn_kali);
        btnBagi = findViewById(R.id.btn_bagi);
        btnJumlah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        tvHasil = findViewById(R.id.tv_hasil);

    }

            @Override
            public void onClick(View v) {

                double angka1 = Double.parseDouble(etAngka1.getText().toString());
                double angka2 = Double.parseDouble(etAngka2.getText().toString());
                double hasil = 0;

                try {
                    switch (v.getId()){
                        case R.id.btn_jumlah:
                            hasil = angka1+angka2;
                            break;
                        case R.id.btn_kurang:
                            hasil = angka1-angka2;
                            break;
                        case R.id.btn_kali:
                            hasil = angka1*angka2;
                            break;
                        case R.id.btn_bagi:
                            hasil = angka1/angka2;
                            break;
                    }
                    tvHasil.setText(String.valueOf(hasil));

                } catch(Exception e){
                    Toast.makeText(getApplicationContext(), "Error, Field Masih Kosong" ,Toast.LENGTH_SHORT).show();
                }
            }
        }




