package com.example.phnf2.revisaoprova.activity;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.phnf2.revisaoprova.R;
import com.example.phnf2.revisaoprova.banco.AppDataBase;
import com.example.phnf2.revisaoprova.banco.ProdutoDao;
import com.example.phnf2.revisaoprova.modelo.Produto;

import java.util.concurrent.ThreadPoolExecutor;

public class CadastrarProduto extends AppCompatActivity {

    AppDataBase db;
    ProdutoDao MyProdutoDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_produto);

        db = AppDataBase.getDatabase(this);
        MyProdutoDao = db.produtoDao();

        final TextInputEditText nome = findViewById(R.id.NomeProduto);
        final TextInputEditText preco = findViewById(R.id.PrecoProduto);
        final TextInputEditText descricao = findViewById(R.id.DescricaoProduto);
        final TextInputEditText fornecedor = findViewById(R.id.FornecedorProduto);
        final TextInputEditText arquivo = findViewById(R.id.ArquivoProduto);

        Button CadastrarProd = findViewById(R.id.CadastrarProd);
        Button Cancelar = findViewById(R.id.CancelarCadastro);

        CadastrarProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nome.getText().length() == 0 || preco.getText().length() == 0 || descricao.getText().length() == 0 ||
                        fornecedor.getText().length() == 0 || arquivo.getText().length()== 0) {

                    Toast.makeText(CadastrarProduto.this, "Preencha Corretamente!!", Toast.LENGTH_SHORT).show();

                }else{
                    MyProdutoDao.Inserir(new Produto(nome.getText().toString(), Double.parseDouble(preco.getText().toString()),
                            descricao.getText().toString(), fornecedor.getText().toString(), Integer.parseInt(arquivo.getText().toString())));

                    Toast.makeText(CadastrarProduto.this, "Só sucesso", Toast.LENGTH_SHORT).show();
                    setResult(RESULT_OK);
                    finish();

                }
            }
        });

        Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

    }
}
