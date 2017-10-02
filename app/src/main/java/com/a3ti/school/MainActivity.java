package com.a3ti.school;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btLogar;
    private TextView btEsqueciSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogar = (Button) findViewById(R.id.btLogar);
        btEsqueciSenha = (TextView) findViewById(R.id.btEsqueciSenha);

        btEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EnviaSenhaActivity.class));
            }
        });

        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ProfessorPrincipalActivity.class));
            }
        });
    }
}
