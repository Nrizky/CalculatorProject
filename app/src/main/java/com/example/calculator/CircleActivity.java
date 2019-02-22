package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CircleActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvHasil;
    private Button btnHitung;
    private EditText Jari;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        Jari = findViewById(R.id.et_Jari);
        tvHasil = findViewById(R.id.tv_hasil);
        btnHitung = findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    try{
        double jari = Double.parseDouble(String.valueOf(Jari.getText()));
        double luaslingkaran = (3.14 * jari * jari);
        tvHasil.setText(String.valueOf(luaslingkaran));


    } catch (Exception e) {
        Toast.makeText(getApplicationContext(), "Error, Field Masih Kosong", Toast.LENGTH_SHORT).show();
    }
}
}