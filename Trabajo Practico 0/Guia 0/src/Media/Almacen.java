package Media;
import Exception.IdentificadorDuplicadoException;

import java.util.HashMap;

public class Almacen<T> {


    Juego juego = new Juego();
    Pelicula pelicula = new Pelicula();
    Serie serie = new Serie();

    HashMap<String, T> almacen;



    public Almacen() {
        almacen = new HashMap<>();

    }



    public void agregarProducto(Media media) throws IdentificadorDuplicadoException {
        try {
            if (almacen.containsKey(media.hashCode())) {
                System.out.println("El objeto ya se encuentra en el almacen");
                throw new IdentificadorDuplicadoException("La clave 'media' ya existe en el almacen");
            } else {
                // Si no existe en el almacen se agrega
                almacen.put("media", (T) media);
                System.out.println("El objeto ha sido agregado al almacen");
            }
        } catch (IdentificadorDuplicadoException e) {
            // Aquí podrías manejar la excepción si es necesario, aunque ya se lanzó arriba
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminarProducto(String buscar){
        almacen.remove(buscar);
    }


    public T buscarProducto (String id ){
        return almacen.get(id);
    }


    



    public void filtrarxGenero (){
        for (Media media : almacen) {

        }

    }










/*
    // Método para agregar un producto de tipo Media
    public void agregarProducto(Media media) throws IdentificadorDuplicadoException {
        String tipo = media.getTipo();

        try {
            if (!almacen.containsKey(tipo)) {
                HashSet<Media> conjunto = almacen.get(tipo);

                // llamamos a comparar para verificar si el id ya existe
                if (comparar(media)) {
                    // Si el id ya existe, lanzamos la excepción
                    throw new IdentificadorDuplicadoException("Error: Ya existe un " + tipo + " con ID " + media.getId());
                } else {
                    conjunto.add(media);
                    System.out.println(tipo + " agregado correctamente: " + media);
                }
            } else {
                System.out.println("Tipo de media no reconocido.");
            }
        } catch (IdentificadorDuplicadoException e) {
            // capturamos y mostramos el mensaje de la excepción
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    // Método para comparar si el ID ya existe
    public boolean comparar(Media media) {
        for (HashSet<Media> conjunto : almacen.values()) {
            for (Media m : conjunto) {
                if (m.getId().equals(media.getId())) {
                    return true; // el ID ya existe en algún conjunto
                }
            }
        }
        return false; // no hay ningún objeto con ese ID
    }

    // Método para eliminar un producto por ID
    public void eliminarProducto(String id, String tipo) {
        if (almacen.containsKey(tipo)) {
            HashSet<Media> conjunto = almacen.get(tipo);
            boolean encontrado = false;

            // buscamos y eliminamos el objeto por ID
            for (Media media : conjunto) {
                if (media.getId().equals(id)) {
                    conjunto.remove(media);
                    System.out.println("Objeto con ID " + id + " eliminado correctamente.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró el objeto con ID " + id + ".");
            }
        } else {
            System.out.println("Tipo de media no reconocido.");
        }
    }

    // mostrar todos los objetos ordenados por título
    public void mostrarTodosOrdenados() {
        for (String tipo : almacen.keySet()) {
            HashSet<Media> conjunto = almacen.get(tipo);
            List<Media> listaOrdenada = new ArrayList<>(conjunto);

            // ordenamos manualmente por título
            for (int i = 0; i < listaOrdenada.size(); i++) {
                for (int j = i + 1; j < listaOrdenada.size(); j++) {
                    if (listaOrdenada.get(i).getTitulo().compareTo(listaOrdenada.get(j).getTitulo()) > 0) {
                        // intercambiar los elementos si no están ordenados
                        Media temp = listaOrdenada.get(i);
                        listaOrdenada.set(i, listaOrdenada.get(j));
                        listaOrdenada.set(j, temp);
                    }
                }
            }

            // mostrar los objetos ordenados
            for (Media media : listaOrdenada) {
                System.out.println(media.getTitulo());
            }
        }
    }

    // filtrar los objetos por género
    public void filtrarPorGenero(String genero) {
        for (String tipo : almacen.keySet()) {
            HashSet<Media> conjunto = almacen.get(tipo);
            boolean encontrado = false;

            // Filtramos los objetos por género
            for (Media media : conjunto) {
                if (media.getGenero().equals(genero)) {
                    System.out.println(media.getTitulo() + " - " + media.getGenero());
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron objetos con el género: " + genero);
            }
        }
    }

    // modificar un atributo de un objeto
    public void modificarAtributo(String id, String tipo, String nuevoTitulo) {
        if (almacen.containsKey(tipo)) {
            HashSet<Media> conjunto = almacen.get(tipo);
            boolean encontrado = false;

            // buscamos el objeto por ID
            for (Media media : conjunto) {
                if (media.getId().equals(id)) {
                    media.setTitulo(nuevoTitulo);
                    System.out.println("Título modificado correctamente: " + media.getTitulo());
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró el objeto con ID " + id + ".");
            }
        } else {
            System.out.println("Tipo de media no reconocido.");
        }
    }*/
}

