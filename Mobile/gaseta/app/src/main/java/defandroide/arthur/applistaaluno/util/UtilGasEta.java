package defandroide.arthur.applistaaluno.util;

public class UtilGasEta {

    public static String mensagem(){
        return "Seja bem vindo";
    }

    public static String calcularMelhorOpcao(double gasolina, double etanol){

        double precoIdeal = gasolina * 0.70;
        String mensagemRetorno;

        if (etanol <= precoIdeal){
            mensagemRetorno = "Abastecer com Etanol";
        }else {
            mensagemRetorno = "Abastecer com Gasolina";
        }
        return mensagemRetorno;
    }

}
