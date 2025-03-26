import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.HashMap;

public class guia_telefonica implements Comparable<String> {



    HashMap<String, Long> guia;


    public guia_telefonica(){
        this.guia = new HashMap<>();
    }



    public String agregar (String nombre, long telefono){
        guia.put(nombre, telefono);
        return "Se agrego " +nombre + " con telefono " +telefono;
    }

    public long buscar(String nombre){
        if (guia.containsKey(nombre)){
             return guia.get(nombre);
        }
        return 0;
    }


    public long borrar(String nombre){
        return guia.remove(nombre);
    }

    public String modificar(long telefono, String nombre){
      long tel = guia.get(nombre);
      guia.replace(nombre,tel, telefono);

      return "Se modifico el contacto";
    }


    public void listar(){
            guia.forEach((key, value) -> System.out.println("Nombre : " +key+ "Telefono : " +value));
    }


    @Override
    public int compareTo(String o) {
        return 0;
    }
}
