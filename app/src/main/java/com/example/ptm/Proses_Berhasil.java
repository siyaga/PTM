package com.example.ptm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Proses_Berhasil extends AppCompatActivity {
    TextView tv_Hasil;
    Button btn_Convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses__berhasil);
        tv_Hasil = (TextView)findViewById(R.id.tv_hasil);


        btn_Convert = (Button)findViewById(R.id.btn_convert_pulsa);

        btn_Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Proses_Berhasil.this, Convert_Pulsa.class);
                startActivity(intent);
            }
        });


    }
}
