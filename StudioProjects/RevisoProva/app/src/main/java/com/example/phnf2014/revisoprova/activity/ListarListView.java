package com.example.phnf2014.revisoprova.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.phnf2014.revisoprova.R;
import com.example.phnf2014.revisoprova.adapter.ListViewAdapter;
import com.example.phnf2014.revisoprova.banco.AppDataBase;
import com.example.phnf2014.revisoprova.banco.ProdutoDao;
import com.example.phnf2014.revisoprova.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListarListView extends AppCompatActivity {

    AppDataBase db;
    ProdutoDao MyProdutoDao;
    List<Produto> listaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_list_view);

        db = AppDataBase.getDatabase(this);
        MyProdutoDao = db.produtoDao();

        ListView listaProduto = findViewById(R.id.ListViewProduto);

        listaList = MyProdutoDao.listAll();

        listaProduto.setAdapter(new ListViewAdapter(this,listaList));
    }
}
