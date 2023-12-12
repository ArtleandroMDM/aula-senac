package defandroide.arthur.trello_csd.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.List;

import defandroide.arthur.trello_csd.Model.Cartas;
import defandroide.arthur.trello_csd.View.MainActivity;

public class CartaController {
        SharedPreferences preferences;
        SharedPreferences.Editor Cartas;
        public static final String NOME_PREFERENCES = "pref-cartas";

        public CartaController(MainActivity mainActivity){

                preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
                Cartas = preferences.edit();
        }
        @NonNull
        @Override
        public String toString() {
                Log.d( "MVC_Controller", "Controller Inciada");
                return super.toString();
        }
        public void salvar(Cartas cartas){

                Log.d("MVC_Controller", "Dados Salvos" + toString());
                Cartas.putString("Carta", cartas.getCarta());
                Cartas.putString("Raridade",cartas.getRaridade());

                Cartas dados = new Cartas();
                dados.put("carta",cartas.getCarta());
                dados.put("Raridade",cartas.getRaridade());

                salvarObjeto("Cartas",dados);
        }

        private void salvarObjeto(String cartas, defandroide.arthur.trello_csd.Model.Cartas dados) {
        }

        public void alterarObjeto(Cartas cartas){

                ContentValues dados = new ContentValues();

                dados.put("Carta",cartas.getCarta());
                dados.put("Raridade",cartas.getRaridade());

                alterarObjeto("carta",dados);
        }

        private void alterarObjeto(String carta, ContentValues dados) {
        }


        public Cartas buscar(Cartas cartas){
                cartas.setCarta(preferences.getString("Carta", "Carta"));
                cartas.setRaridade(preferences.getString("Raridade", "Raridade  "));
                return cartas;
        }
        public void limpar() {
                Cartas.clear();
                Cartas.apply();
        }
        public List<Cartas> getListadados(){
                return getListadados();
        }
        public void alterar(Cartas objAlteracao){
                
        }
}