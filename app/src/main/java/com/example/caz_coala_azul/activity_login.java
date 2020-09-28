package com.example.caz_coala_azul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {
    TextView irPraCadastro = (TextView)findViewById(R.id.txt_irCadastrar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        irPraCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(activity_login.this, activity_cadastro.class);
                startActivity(it);
            }
        });
    }
}
