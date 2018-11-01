package com.example.phnf2.revisaoprova.banco;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.phnf2.revisaoprova.modelo.Produto;
import java.util.List;

@Dao
public interface ProdutoDao {

    @Insert
    long Inserir(Produto produto);

    @Delete
    int Deletar(Produto produto);

    @Update
    int Atualizar(Produto produto);

    @Query("SELECT * FROM produto")
    List<Produto> listAll();

    @Query("SELECT * FROM produto WHERE id = :id")
    List<Produto> listById(int id);
}
