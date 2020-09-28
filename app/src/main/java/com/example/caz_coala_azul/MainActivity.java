package com.example.caz_coala_azul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button irPralogin= (Button)findViewById(R.id.btnIrparaLogin);
    private Button irPraCadastro = (Button)findViewById(R.id.btnIrparaSignup);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        irPralogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,activity_login.class);
                startActivity(it);

            }
        });

        irPraCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, activity_cadastro.class);
                startActivity(it);
            }
        });
    }
}
