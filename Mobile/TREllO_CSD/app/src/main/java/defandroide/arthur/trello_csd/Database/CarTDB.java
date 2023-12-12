package defandroide.arthur.trello_csd.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import defandroide.arthur.trello_csd.Model.Cartas;

public class CarTDB extends SQLiteOpenHelper {

    public static  final String DB_NAME = "cart_db";

    public static  final int DB_VERSION = 1;

    Cartas cartas;
    SQLiteDatabase db;

    public CarTDB(Context context){
        super(context,DB_NAME,null,DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        String sqTabela =
                "CREATE TABLE Cartas(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                        "NomeCarta TEXT,"+
                        "RaridadeCarta TEXT)";

        db.execSQL(sqTabela);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void salvarObjeto(String tabela, ContentValues dados){
        db.insert(tabela, null, dados);
    }
}
