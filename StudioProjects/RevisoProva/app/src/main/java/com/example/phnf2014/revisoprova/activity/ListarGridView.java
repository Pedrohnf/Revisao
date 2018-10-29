package com.example.phnf2014.revisoprova.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.phnf2014.revisoprova.R;
import com.example.phnf2014.revisoprova.adapter.ListViewAdapter;
import com.example.phnf2014.revisoprova.banco.AppDataBase;
import com.example.phnf2014.revisoprova.banco.ProdutoDao;
import com.example.phnf2014.revisoprova.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListarGridView extends AppCompatActivity {

    AppDataBase db;
    ProdutoDao MyProdutoDao;
    List<Produto> listaGrid = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_grid_view);

        db = AppDataBase.getDatabase(this);
        MyProdutoDao = db.produtoDao();

        final GridView listaX = findViewById(R.id.ListaGrid);

        listaGrid = MyProdutoDao.listAll();

        listaX.setAdapter(new ListViewAdapter(this,listaGrid));
    }
}
