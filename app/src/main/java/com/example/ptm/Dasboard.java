package com.example.ptm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dasboard extends AppCompatActivity {
    TextView tv_Logout;
    Button btn_Convert_Pulsa, btn_Edit_profil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);

        tv_Logout = (TextView)findViewById(R.id.tv_logout);
        btn_Convert_Pulsa = (Button) findViewById(R.id.btn_convert_pulsa);

        btn_Convert_Pulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dasboard.this, Convert_Pulsa.class);
                startActivity(intent);
            }
        });
    }
}
