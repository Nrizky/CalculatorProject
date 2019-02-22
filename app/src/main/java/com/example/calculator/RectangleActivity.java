package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RectangleActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvHasil;
    private Button btnHitung;
    private EditText et_Panjang, et_Lebar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        et_Panjang = findViewById(R.id.et_panjang);
        et_Lebar = findViewById(R.id.et_lebar);
        tvHasil = findViewById(R.id.tv_hasil);
        btnHitung = findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        double et_panjang = Double.parseDouble(et_Panjang.getText().toString());
        double et_lebar = Double.parseDouble(et_Lebar.getText().toString());
        double luasPersegiPanjang = (et_lebar * et_panjang);
        tvHasil.setText(String.valueOf(luasPersegiPanjang));

    }
}