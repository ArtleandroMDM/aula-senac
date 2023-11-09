package defandroide.arthur.applistaaluno.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import defandroide.arthur.applistaaluno.model.Pessoa;
import defandroide.arthur.applistaaluno.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaAlunos;
    public static final String NOME_PREFERENCES = "pref_lista";


    public PessoaController(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);




    }

    @NonNull
    @Override
    public String toString() {
        Log.d( "MVC_Controller", "Controller Inciada");
        return super.toString();

    }

    public void Salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Dados Salvos" + toString());
    }
    public void  buscar(){

    }
    public void limpar(){

    }
}
