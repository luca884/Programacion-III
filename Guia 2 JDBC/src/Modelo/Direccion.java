package Modelo;

public class Direccion {

    private int direccion_id;
    private String calle;
    private int altura;
    private int alumno_id;

    public Direccion(int direccionId, String calle, int altura, int alumno_id){
        this.direccion_id = direccionId;
        this.altura = altura;
        this.alumno_id = alumno_id;
        this.calle = calle;
    }

    public Direccion( String calle, int altura, int alumno_id){
        this.altura = altura;
        this.alumno_id = alumno_id;
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "direccion_id=" + direccion_id +
                ", calle='" + calle + '\'' +
                ", altura=" + altura +
                ", alumno_id=" + alumno_id +
                '}';
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(int direccion_id) {
        this.direccion_id = direccion_id;
    }
}
