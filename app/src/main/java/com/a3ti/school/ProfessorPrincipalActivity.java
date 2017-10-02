package com.a3ti.school;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfessorPrincipalActivity extends AppCompatActivity {

    private ImageView btSair;
    private ImageView btChamada;
    private ImageView btRelatorio;
    private ImageView btNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor_principal);

        btSair = (ImageView) findViewById(R.id.btSair);
        btChamada = (ImageView) findViewById(R.id.btChamda);
        btRelatorio = (ImageView) findViewById(R.id.btRelatorio);
        btNotas = (ImageView) findViewById(R.id.btNotas);


        btChamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfessorPrincipalActivity.this, ChamadaActivity.class));
            }
        });

        btNotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfessorPrincipalActivity.this, IncluirNotasActivity.class));
            }
        });


        btRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfessorPrincipalActivity.this, RElAlunosActivity.class));
            }
        });

        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfessorPrincipalActivity.this, MainActivity.class));
            }
        });


    }
}
