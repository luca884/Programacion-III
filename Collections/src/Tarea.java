import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tarea {

    ArrayList tareas;

    public Tarea (){
        this.tareas = new ArrayList<>();
    }



    public void agregar(String tarea){
        tareas.add(tarea);
    }

    public void eliminar(int index){
        tareas.remove(index);
    }


    public void mostrar(){

        for (int i = 0; i < tareas.size(); i++){
            System.out.println("Tarea " + i + " " + tareas.get(i));
        }
    }


    public void modificar(String tarea, int index){
        eliminar(index);
        agregar(tarea);
    }


}
