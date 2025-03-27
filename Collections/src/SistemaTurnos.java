import java.util.PriorityQueue;
import java.util.Queue;

class Paciente implements Comparable<Paciente>{

    private String nombre;
    private int prioridad;

    public Paciente(String nombre, int prioridad){
        this.prioridad = prioridad;
        this.nombre = nombre;
    }




    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.prioridad, otro.prioridad); //este metodo los ordena con la prioridad
    }
    //Aunque yo nunca llame al metodo JAVA lo hace solo y los compara.
    //Pero si no le doy con comparable JAVA no podria ordenarlo.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " | Prioridad: " + prioridad;
    }


}

public class SistemaTurnos {
    PriorityQueue<Paciente> turnos;

    public SistemaTurnos(){
        this.turnos = new PriorityQueue<>();
    }

    public void agregarPaciente(String nombre, int prioridad){
        turnos.offer(new Paciente(nombre,prioridad));
        System.out.println("Se agregó el paciente: " + nombre + " con prioridad " + prioridad);
    }

    public void atenderPaciente(){
        Paciente atendido = turnos.poll();
        System.out.println("Atendiendo a: " + atendido.getNombre() + " (Prioridad: " + atendido.getPrioridad() + ")");
    }


    public void mostrarColaPacientes(){
        turnos.forEach(System.out::println);
    }


}
