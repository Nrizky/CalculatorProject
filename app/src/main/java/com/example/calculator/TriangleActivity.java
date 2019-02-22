package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TriangleActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvHasil;
    private Button btnHitung;
    private EditText et_Alas, et_Tinggi;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        et_Alas = findViewById(R.id.et_alas);
        et_Tinggi = findViewById(R.id.et_tinggi);
        tvHasil = findViewById(R.id.tv_hasil);
        btnHitung = findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {

            double et_alas = Double.parseDouble(et_Alas.getText().toString());
            double et_tinggi = Double.parseDouble(et_Tinggi.getText().toString());
            double luasSegitiga = (et_alas * et_tinggi / 2);
            tvHasil.setText(String.valueOf(luasSegitiga));


        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error, Field Masih Kosong", Toast.LENGTH_SHORT).show();
        }
    }
}