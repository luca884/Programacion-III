package Media;

public class Serie extends Media {

    private int cantCapitulos;

    public Serie(String titulo, String genero, String id, String expansion, String tipo, int cantCapitulos) {
        super(titulo, genero, id, expansion, tipo);
        cantCapitulos = cantCapitulos;
    }

    public Serie() {

    }

    @Override
    public String toString() {
        return "Serie{" +
                "cantCapitulos=" + cantCapitulos +
                '}';
    }

    public int getCantCapitulos() {
        return cantCapitulos;
    }

    public void setCantCapitulos(int cantCapitulos) {
        this.cantCapitulos = cantCapitulos;
    }
}
