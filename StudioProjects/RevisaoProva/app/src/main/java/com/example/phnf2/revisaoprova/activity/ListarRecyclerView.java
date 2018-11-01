package com.example.phnf2.revisaoprova.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.phnf2.revisaoprova.R;
import com.example.phnf2.revisaoprova.adapter.RecyclerViewAdapter;
import com.example.phnf2.revisaoprova.banco.AppDataBase;
import com.example.phnf2.revisaoprova.banco.ProdutoDao;
import com.example.phnf2.revisaoprova.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListarRecyclerView extends AppCompatActivity {

    AppDataBase db;
    ProdutoDao MyProdutoDao;
    List<Produto> listaProdutos1 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_recycler_view);


        db = AppDataBase.getDatabase(this);
        MyProdutoDao = db.produtoDao();


        listaProdutos1 = MyProdutoDao.listAll();

        final RecyclerView recyclerView = findViewById(R.id.listarRecy);

        recyclerView.setAdapter(new RecyclerViewAdapter(this,listaProdutos1));


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
