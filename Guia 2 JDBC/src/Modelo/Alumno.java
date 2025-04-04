package Modelo;

public class Alumno  {

    private int alumno_id;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    // Constructr con ID para recuperar los datos en la BDD
    public Alumno(int alumnoId, String nombre, String apellido, int edad, String email){
        this.alumno_id = alumnoId;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
        this.nombre = nombre;
    }

    // Constructor sin ID
    public Alumno(String nombre, String apellido, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }


    public String toString(Alumno alumno) {
        return "Alumno{" +
                "alumno_id=" + alumno.alumno_id +
                ", nombre='" + alumno.nombre + '\'' +
                ", apellido='" + alumno.apellido + '\'' +
                ", edad=" + alumno.edad +
                ", email='" + alumno.email + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }
}
