package defandroide.arthur.applistaaluno.model;

public class Gaseta {

    private String id_gasolina;
    private String id_etanol;

    public  Gaseta() {}

    public String getId_gasolina() {
        return id_gasolina;
    }

    public void setId_gasolina(String id_gasolina) {
        this.id_gasolina = id_gasolina;
    }

    public String getId_etanol() {
        return id_etanol;
    }

    public void setId_etanol(String id_etanol) {
        this.id_etanol = id_etanol;
    }

    @Override
    public String toString() {
        return "Gaseta{" +
                "id_gasolina='" + id_gasolina + '\'' +
                ", id_etanol='" + id_etanol + '\'' +
                '}';
    }
}
