package com.example.phnf2014.revisoprova.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.phnf2014.revisoprova.R;
import com.example.phnf2014.revisoprova.adapter.ViewPageAdapter;
import com.example.phnf2014.revisoprova.banco.AppDataBase;
import com.example.phnf2014.revisoprova.banco.ProdutoDao;
import com.example.phnf2014.revisoprova.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListarViewPage extends AppCompatActivity {

    AppDataBase db;
    ProdutoDao MyProdutoDao;
    List<Produto> listaProduto = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_view_page);

        db = AppDataBase.getDatabase(this);
        MyProdutoDao = db.produtoDao();

        listaProduto = MyProdutoDao.listAll();

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new ViewPageAdapter(this, listaProduto));
        viewPager.addOnPageChangeListener(MyListener);

    }

        private ViewPager.OnPageChangeListener MyListener = new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };

}
