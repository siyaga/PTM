package com.example.ptm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Proses_Transaksi extends AppCompatActivity {
    Button btn_Proses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses__transaksi);

        btn_Proses = (Button)findViewById(R.id.btn_proses);

        btn_Proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Proses_Transaksi.this, Proses_Berhasil.class);
                startActivity(intent);
            }
        });
    }
}
