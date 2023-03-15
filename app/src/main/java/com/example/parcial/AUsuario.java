package com.example.parcial;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class AUsuario {
    Context c;
    Usuario u;
    ArrayList<Usuario> lista;
    SQLiteDatabase sql;
    String bd="BDUsuarios";
    String tabla = "create table usuario(id integer primary key autoincrement, usuario text, pass text)"

  public AUsuario(Context c){
        this.c=c;
        sql=c.openOrCreateDatabase(bd, c.MODE_PRIVATE,null);
        sql.execSQL(tabla);
        u= new Usuario();
  }

  public boolean insertUsuario(Usuario U){

        if(buscar(u.getUsuario())==0)
            ContentValues cv=new ContentValues();
        

  }

}
