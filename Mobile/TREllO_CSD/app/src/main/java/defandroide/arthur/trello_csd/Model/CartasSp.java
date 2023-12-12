package defandroide.arthur.trello_csd.Model;

public class CartasSp {

    private String CartasDesejada;

    public CartasSp(String CartasDesejada) {
        this.CartasDesejada = getCartasDesejada();
    }

    public String getCartasDesejada() {
        return CartasDesejada;
    }

    public void setCartasDesejada(String cartasDesejada) {
        CartasDesejada = cartasDesejada;
    }

}
