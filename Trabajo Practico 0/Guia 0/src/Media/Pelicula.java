package Media;

public class Pelicula extends Media{

    private String duracion;

    public Pelicula(String titulo, String genero, String id, String expansion, String tipo, String duracion) {
        super(titulo, genero, id, expansion, tipo);
        duracion = duracion;
    }

    public Pelicula() {

    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "duracion='" + duracion + '\'' +
                '}';
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
