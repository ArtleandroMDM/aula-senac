package defandroide.arthur.applistaaluno.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import defandroide.arthur.applistaaluno.model.Curso;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "gaseta_db";

    public static final int DB_VERSION = 1;

    Curso curso;
    SQLiteDatabase db;

    public GasEtaDB(Context context){
        super(context, DB_NAME, null, DB_VERSION);
        db =getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqTabela =
                "CREATE TABLE Combustivel(id INTEGER PRIMARY KEY AUTOINCREMENT"+
                        "nomeCombustivel TEXT, "+
                        "precoCobustivel REAL, "+
                        "recomendacao";

        db.execSQL(sqTabela);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
