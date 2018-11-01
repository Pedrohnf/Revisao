package com.example.phnf2.revisaoprova.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.phnf2.revisaoprova.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button CadastrarProduto = findViewById(R.id.Cadastrar);
        final Button listarListView = findViewById(R.id.ListarListView);
        final Button ListarGridView = findViewById(R.id.ListarGridView);
        final Button BuscarP = findViewById(R.id.Buscar1);
        final Button ListarRecylcer = findViewById(R.id.ListarRecycler);
        final Button ListarViewPage = findViewById(R.id.ListarViewPageX);
        final Button SwipeDr = findViewById(R.id.SwipeDrop);
        final Button Fragme = findViewById(R.id.Frag);


        CadastrarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(),CadastrarProduto.class);
                startActivity(i1);
            }
        });


        BuscarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(),BuscarProduto.class);
                startActivity(i2);
            }
        });

        listarListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(),ListarListView.class);
                startActivity(i3);
            }
        });

        ListarGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getApplicationContext(),ListarGridView.class);
                startActivity(i4);
            }
        });

        ListarRecylcer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getApplicationContext(),ListarRecyclerView.class);
                startActivity(i5);
            }
        });


        ListarViewPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getApplicationContext(),ListarViewPage.class);
                startActivity(i6);
            }
        });


        SwipeDr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getApplicationContext(),SwipeDrop.class);
                startActivity(i7);
            }
        });


        Fragme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(getApplicationContext(),Fragment_Listar.class);
            }
        });

    }
}
