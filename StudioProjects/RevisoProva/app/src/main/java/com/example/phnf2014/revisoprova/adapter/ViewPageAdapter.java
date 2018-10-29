package com.example.phnf2014.revisoprova.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.phnf2014.revisoprova.R;
import com.example.phnf2014.revisoprova.modelo.Produto;

import java.util.List;

public class ViewPageAdapter extends PagerAdapter {

    Context context;
    List<Produto> listaProdutos;

    public ViewPageAdapter(Context context, List<Produto> listaProdutos) {
        this.context = context;
        this.listaProdutos = listaProdutos;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        View view = LayoutInflater.from(context).inflate(R.layout.view_page_inflater,container,false);
        ImageView img = view.findViewById(R.id.imgPageView);
        //img.setImageResource(listaProdutos.get(position).getArquivo());

        if(listaProdutos.get(position).getArquivo() == 1) {
            img.setImageResource(R.drawable.caderno);
        }else if(listaProdutos.get(position).getArquivo() == 2) {
            img.setImageResource(R.drawable.coxinha);
        }else if (listaProdutos.get(position).getArquivo() == 3) {
            img.setImageResource(R.drawable.treloso);
        }else if(listaProdutos.get(position).getArquivo() == 4){
            img.setImageResource(R.drawable.refrigerante);
        }else if(listaProdutos.get(position).getArquivo() == 5){
                img.setImageResource(R.drawable.mochila);
        }

        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return listaProdutos == null ? 0 : listaProdutos.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    // Serve para otimizar memoria
    @Override
    public void destroyItem(ViewGroup container, int position, Object view){
        Log.i("Revisao", "chamou destroyItem, posição = "+ position);
        container.removeView((View) view);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return listaProdutos.get(position).getNome();
    }
}


