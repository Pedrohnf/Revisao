package com.example.phnf2.revisaoprova.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.phnf2.revisaoprova.R;
import com.example.phnf2.revisaoprova.modelo.Produto;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    Context context;
    List<Produto> listaProduto;


    public ListViewAdapter(Context context, List<Produto> listaProduto) {
        this.context = context;
        this.listaProduto = listaProduto;
    }

    @Override
    public int getCount() {
        return listaProduto != null ? listaProduto.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return listaProduto.get(i);
    }

    @Override
    public long getItemId(int i) {
        return  i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        View view;
        ListViewProdutoViewHolder holder;

        if(convertView == null){

            view = LayoutInflater.from(context).inflate(R.layout.list_view_inflater, viewGroup,false);
            holder = new ListViewProdutoViewHolder(view);
            view.setTag(holder);

        }else{

            view = convertView;
            holder = (ListViewProdutoViewHolder) convertView.getTag();

        }

        Produto l = listaProduto.get(i);

        holder.nomeProduto.setText(l.getNome());
        holder.precoProduto.setText(""+l.getPreco());
        holder.fornecedorProduto.setText(l.getFornecedor());
        //holder.imgProduto.setImageResource(R);

        if(l.getArquivo() == 1){
            holder.imgProduto.setImageResource(R.drawable.caderno);
        }else if(l.getArquivo() == 2){
            holder.imgProduto.setImageResource(R.drawable.coxinha);
        }else if(l.getArquivo() == 3){
            holder.imgProduto.setImageResource(R.drawable.treloso);
        }else if(l.getArquivo() == 4){
            holder.imgProduto.setImageResource(R.drawable.refrigerante);
        }else if(l.getArquivo() == 5){
            holder.imgProduto.setImageResource(R.drawable.mochila);
        }

        return view;
    }


    public class ListViewProdutoViewHolder {

        final TextView nomeProduto;
        final TextView precoProduto;
        final TextView fornecedorProduto;
        final ImageView imgProduto;

        public ListViewProdutoViewHolder(View v) {
            nomeProduto = v.findViewById(R.id.nome);
            precoProduto = v.findViewById(R.id.preco);
            fornecedorProduto = v.findViewById(R.id.fornecedor);
            imgProduto = v.findViewById(R.id.img);
        }
    }


}
