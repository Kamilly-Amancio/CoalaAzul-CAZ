package com.example.caz_coala_azul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_cadastro extends AppCompatActivity {
    TextView irPraLogin = (TextView)findViewById(R.id.text_ir_pra_login);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        irPraLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(activity_cadastro.this, activity_login.class);
                startActivity(it);
            }
        });
    }
}
