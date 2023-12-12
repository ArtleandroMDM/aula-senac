package defandroide.arthur.trello_csd.controller;

import java.util.ArrayList;
import java.util.List;

import defandroide.arthur.trello_csd.Model.CartasSp;

public class CartaSpContrller {

        private static List listcart;

        public static List getListcart(){

            listcart = new ArrayList<CartasSp>();

            listcart.add(new CartasSp("Mago Negro"));
            listcart.add(new CartasSp("Exodia"));
            listcart.add(new CartasSp("Pot of Greed"));
            listcart.add(new CartasSp("Watarpon"));
            listcart.add(new CartasSp("Demonio Selvagen"));


            return listcart;
        }
        public static ArrayList<String> dadosSpinner(){
            ArrayList<String> dados = new ArrayList<>();
            for (int i = 0; i <getListcart().size(); i++){

                CartasSp objeto = (CartasSp) getListcart().get(i);

              dados.add(objeto.getCartasDesejada());
            }
            return dados;
        }
}

