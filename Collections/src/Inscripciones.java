import java.util.HashSet;

public class Inscripciones  {

    String texto;

    HashSet<String> listaInscriptos;



    public Inscripciones(){
        listaInscriptos = new HashSet<>();
    }


    public void agregar(String nombre){
        listaInscriptos.add(nombre);
    }


    public void eliminar(String nombre){
        listaInscriptos.remove(nombre);
    }
    public boolean comparar(String nombre){
        return listaInscriptos.contains(nombre);

    }

    public void mostrar(){
        for (String nombre : listaInscriptos){
            System.out.println(nombre);
        }
    }



}
