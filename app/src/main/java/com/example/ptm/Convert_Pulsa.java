package com.example.ptm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Convert_Pulsa extends AppCompatActivity {
    double telkom, xl, indosat, tri;
    RadioGroup rg_nilai_pulsa;
    TextView tv_hasil;
    EditText edt_Nilai_Pulsa;
    Button btn_Komfirmasi, btn_Hasil;
    String a;
    double nilai,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert__pulsa);

        edt_Nilai_Pulsa = (EditText)findViewById(R.id.edt_nilai_pulsa);
        btn_Hasil = (Button)findViewById(R.id.btn_hitung);
        btn_Hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Pilih_Pulsa();
                Hasil();
            }
        });
        tv_hasil = (TextView)findViewById(R.id.tv_hasil);





        btn_Komfirmasi = (Button)findViewById(R.id.btn_komfirmasi);

        btn_Komfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Convert_Pulsa.this, Konfirmasi_Pengiriman.class);
                startActivity(intent);
            }
        });
    }
    public boolean validasi(){
        if (edt_Nilai_Pulsa.getText().toString().isEmpty()){
            Toast.makeText(this, "Mohon diisi angka", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    public void Pilih_Pulsa(){
        nilai = Double.parseDouble(edt_Nilai_Pulsa.getText().toString());
        rg_nilai_pulsa = (RadioGroup) findViewById(R.id.rg_pulsa);
        rg_nilai_pulsa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                RadioButton rbtn = (RadioButton) rg_nilai_pulsa.findViewById(i);

                switch (i){
                    case R.id.rb_telkomsel:
                        a ="Telkomsel";
                        break;
                    case R.id.rb_xl:
                        a ="Xl";
                        break;
                    case R.id.rb_indosat:
                        a ="Indosat";
                        break;
                    case R.id.rb_tri:
                        a ="Tri";
                        break;
                }

            }
        });
    }

    public void Hasil(){

        if (!validasi()){
            return;
        }
        try {
            nilai = Double.parseDouble(edt_Nilai_Pulsa.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Hanya bisa diisi angka", Toast.LENGTH_SHORT).show();
        }

                    if(a == "Telkomsel") {

                        hasil = 0.75 * nilai;
                        tv_hasil.setText(String.valueOf(hasil));
                    }
                   if(a == "Xl") {
                       hasil = 0.5 * nilai;
                       tv_hasil.setText(String.valueOf(hasil));
                   }
                    if(a == "Indosat") {
                        hasil = 0.5 * nilai;
                        tv_hasil.setText(String.valueOf(hasil));
                   }
                    if(a == "Tri"){
                        hasil = 0.4 * nilai;
                        tv_hasil.setText(String.valueOf(hasil));
                        }

                }



}
