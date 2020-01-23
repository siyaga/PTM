package com.example.ptm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Konfirmasi_Pengiriman extends AppCompatActivity {
    TextView tv_Hasil;
    Button btn_Proses;
    ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi__pengiriman);
        tv_Hasil = (TextView)findViewById(R.id.tv_hasil);
        iv_back = (ImageView) findViewById(R.id.iv_back);
        btn_Proses = (Button)findViewById(R.id.btn_proses);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        btn_Proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Konfirmasi_Pengiriman.this, Proses_Transaksi.class);
                startActivity(intent);
            }
        });
    }
}
