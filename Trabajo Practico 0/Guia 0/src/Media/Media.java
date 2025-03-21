package Media;

import java.util.Objects;

public abstract class Media {


    private String titulo;
    private String genero;
    private String id;
    private String expansion;
    private String tipo;



    public Media (String titulo,String genero,String id, String expansion, String tipo){
        this.titulo = titulo;
        this.genero = genero;
        this.id = id;
        this.expansion = expansion;
        this.tipo = tipo;
    }

    public Media() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return Objects.equals(titulo, media.titulo) && Objects.equals(genero, media.genero) && Objects.equals(id, media.id) && Objects.equals(expansion, media.expansion) && Objects.equals(tipo, media.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, id, expansion, tipo);
    }

    /*
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Media media = (Media) obj;
            return id == media.id; // Se considera igual si tienen el mismo ID
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    */
    @Override
    public String toString() {
        return "Media{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", id='" + id + '\'' +
                ", expansion='" + expansion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getId() {
        return id;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
