package Media;

public class Juego extends Media {

    private int version;

    public Juego(String titulo, String genero, String id, String expansion,String tipo ,int version) {
        super(titulo, genero, id, expansion, tipo);
        version = version;

    }

    public Juego() {
        super();
    }


    @Override
    public String toString() {
        return "Juego{" +
                "version=" + version +
                '}';
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }


}
