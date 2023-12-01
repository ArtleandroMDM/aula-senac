package defandroide.arthur.applistaaluno.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.List;

import defandroide.arthur.applistaaluno.database.GasEtaDB;
import defandroide.arthur.applistaaluno.model.Combustivel;
import defandroide.arthur.applistaaluno.view.GasEtaActivity;

public class CombustivelController extends GasEtaDB {

    SharedPreferences preferences;

    SharedPreferences.Editor Gaseta;

    public static final String NOME_PREFERENCES = "pref_gaseta";

    public CombustivelController(GasEtaActivity gasetaActivity){
        super(gasetaActivity);

        preferences = gasetaActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        Gaseta = preferences.edit();


    }
    @NonNull
    @Override
    public String toString(){
        Log.d("MVC_Controller", "Comtroller Inciada");
        return  super.toString();
    }

    public void salvar(Combustivel combustivel){


        Gaseta.putString("Combustivel", combustivel.getNomeCombustivel());
        Gaseta.putFloat("precoCombustivel", (float) combustivel.getPrecoCombustivel());
        Gaseta.putString("recomendacao", combustivel.getRecomendacao());
        Gaseta.apply();

        ContentValues dados = new ContentValues();
        dados.put("nomeCombustivel", combustivel.getNomeCombustivel());
        dados.put("precoCombustivel", combustivel.getPrecoCombustivel());
        dados.put("recomendacao", combustivel.getRecomendacao());

        salvarObjeto("Combustive",dados);
    }
    public void alterarObjeto(Combustivel combustivel){

        ContentValues dados = new ContentValues();

        dados.put("id",combustivel.getId());
        dados.put("nomeCombustivel", combustivel.getNomeCombustivel());
        dados.put("precoCombustivel", combustivel.getPrecoCombustivel());
        dados.put("recomendacao", combustivel.getRecomendacao());

        alterarObjeto("combustivel", dados);
    }

    public void deletarObjeto( int id) {
        deletarObjeto("Combustivel", id);
    }


    public void limpar(){
        Gaseta.clear();
        Gaseta.apply();
    }

    public List<Combustivel> getListaDados() {

        return listarDados();
    }

    public void alterar(Combustivel objAlteracao) {
    }
}
