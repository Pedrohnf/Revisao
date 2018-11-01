package com.example.phnf2.revisaoprova.banco;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.phnf2.revisaoprova.modelo.Produto;

@Database(entities = {Produto.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {

    public abstract ProdutoDao produtoDao();

    private static AppDataBase INSTANCE;

   public static AppDataBase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (AppDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                               AppDataBase.class, "produto_database.sqlite")
                               .allowMainThreadQueries()
                               .build();
                }
            }
        }
        return INSTANCE;
    }

}
