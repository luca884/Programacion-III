import java.util.Map;
import java.util.TreeMap;

public class CatalgoOrdenado {

    TreeMap<String, Double> catalogo;

    public CatalgoOrdenado(){
        this.catalogo = new TreeMap<>();
    }


    public void agregarProducto(String nombre, double precio){
        catalogo.put(nombre,precio);
        System.out.println("Se agrego el producto "+ nombre);
    }


    public double obtenerPrecio(String nombreK){
        double p = catalogo.get(nombreK);
        return p;
    }


    public void actualizarPrecio(String nombre, double precioN){
        double p = obtenerPrecio(nombre);
        catalogo.replace(nombre,p,precioN);
        System.out.println("Se actualizo el precio");
    }


    public void eliminaProducto(String nombre){
        catalogo.remove(nombre);
    }

    public void mostrarCatalogo(){
        catalogo.forEach((nombre, precio) -> System.out.println(nombre + " $" +precio));
    }



}
