package com.example.phnf2014.revisoprova.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phnf2014.revisoprova.R;
import com.example.phnf2014.revisoprova.modelo.Produto;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    Context context;
    List<Produto> listaProdutos;

    public RecyclerViewAdapter(Context context, List<Produto> listaProdutos) {
        this.context = context;
        this.listaProdutos = listaProdutos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_inflater,viewGroup,false);

        RecylcerViewProudtoViewHolder rvpv = new RecylcerViewProudtoViewHolder(view);

        return rvpv;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        RecylcerViewProudtoViewHolder  produtoholder = (RecylcerViewProudtoViewHolder) viewHolder;

        final Produto produtoEscolhido = listaProdutos.get(i);

        produtoholder.NomeProduto.setText(produtoEscolhido.getNome());

        if(produtoEscolhido.getArquivo() == 1){
            produtoholder.imgX.setImageResource(R.drawable.caderno);
        }else if(produtoEscolhido.getArquivo() == 2){
            produtoholder.imgX.setImageResource(R.drawable.coxinha);
        }else if(produtoEscolhido.getArquivo() == 3){
            produtoholder.imgX.setImageResource(R.drawable.treloso);
        }else if(produtoEscolhido.getArquivo() == 4){
            produtoholder.imgX.setImageResource(R.drawable.refrigerante);
        }else if(produtoEscolhido.getArquivo() == 5){
            produtoholder.imgX.setImageResource(R.drawable.mochila);
        }

    }

    @Override
    public int getItemCount() {
        return listaProdutos == null ? 0 : listaProdutos.size();
    }


    public class RecylcerViewProudtoViewHolder extends RecyclerView.ViewHolder{

        final ImageView imgX;
        final TextView NomeProduto;

        public RecylcerViewProudtoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgX = itemView.findViewById(R.id.imgProd);
            NomeProduto = itemView.findViewById(R.id.NomeProdutoX);

        }
    }

}
