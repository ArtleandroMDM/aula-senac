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
        listaAlunos = preferences.edit();



    }

    @NonNull
    @Override
    public String toString() {
        Log.d( "MVC_Controller", "Controller Inciada");
        return super.toString();

    }

    public void Salvar(Pessoa pessoa) {

        Log.d("MVC_Controller", "Dados Salvos" + toString());
        listaAlunos.putString("PrimeiroNome", pessoa.getPrimeiroNome());
        listaAlunos.putString("Sobrenome", pessoa.getSobrenome());
        listaAlunos.putString("Matricula", pessoa.getMatricula());
        listaAlunos.putString("CPF", pessoa.getCPF());
        listaAlunos.apply();
    }

    public Pessoa buscar(Pessoa pessoa){

         pessoa.setPrimeiroNome(preferences.getString("PrimeiroNome", "NA"));
         pessoa.setSobrenome(preferences.getString("Sobrenome", "NA"));
         pessoa.setMatricula(preferences.getString("Matricula", "NA"));
         pessoa.setCPF(preferences.getString("CPF", "NA"));
         return pessoa;
    }
    public void limpar(){
        listaAlunos.clear();
        listaAlunos.apply();


    }
}
