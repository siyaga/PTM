package com.example.ptm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Convert_Pulsa extends AppCompatActivity {
    double telkom, xl, indosat, tri;
    RadioButton rb_Telkom, rb_Xl, rb_Indosat, rb_Tri;
    TextView tv_hasil;
    EditText edt_Nilai_Pulsa;
    Button btn_Komfirmasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert__pulsa);

        edt_Nilai_Pulsa = (EditText)findViewById(R.id.edt_nilai_pulsa);
        tv_hasil = (TextView)findViewById(R.id.tv_hasil);

        telkom = 0.75;
        xl = 0.5;
        indosat = 0.5;
        tri = 0.4;
        rb_Telkom = (RadioButton)findViewById(R.id.rb_telkomsel);
        rb_Xl = (RadioButton)findViewById(R.id.rb_xl);
        rb_Indosat = (RadioButton)findViewById(R.id.rb_indosat);
        rb_Tri = (RadioButton)findViewById(R.id.rb_tri);



        btn_Komfirmasi = (Button)findViewById(R.id.btn_komfirmasi);

        btn_Komfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Convert_Pulsa.this, Konfirmasi_Pengiriman.class);
                startActivity(intent);
            }
        });
    }
}
