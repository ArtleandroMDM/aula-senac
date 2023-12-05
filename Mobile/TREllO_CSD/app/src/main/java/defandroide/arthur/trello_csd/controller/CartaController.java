package defandroide.arthur.trello_csd.controller;

import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

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
        }

        public Cartas buscar(Cartas cartas){
                cartas.setCarta(preferences.getString("Carta", "NA"));
                cartas.setRaridade(preferences.getString("Raridade", "NA"));
                return cartas;
        }
        public void limpar() {
                Cartas.clear();
                Cartas.apply();
        }
}