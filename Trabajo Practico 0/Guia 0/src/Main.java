import Media.Almacen;
import Media.Juego;
import Media.Pelicula;
import Media.Serie;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Almacen almacen = new Almacen();

        while (true) {
            System.out.println("\nMenú de Opciones ");
            System.out.println("1. Agregar un nuevo juego o expansión a la colección.");
            System.out.println("2. Eliminar un objeto específico por su identificador.");
            System.out.println("3. Mostrar todos los objetos de la colección ordenados por título.");
            System.out.println("4. Filtrar los objetos por género.");
            System.out.println("5. Modificar un atributo de un objeto.");
            System.out.println("6. Salir.");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer


            Juego juegos = new Juego("hhola", "terror", "33", "expansion", "juego", 2);

            switch (opcion) {
                case 1:
                    // Primero, pedir el título y el tipo de producto
                    System.out.print("Ingrese el título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el tipo de producto : ");
                    String tipo = scanner.nextLine();

                    // Verificar el tipo
                    if (Objects.equals(tipo, "juego")) {
                        System.out.print("Ingrese el género: ");
                        String genero = scanner.nextLine();
                        System.out.print("Ingrese el ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Ingrese la expansión (si aplica): ");
                        String expansion = scanner.nextLine();
                        System.out.print("Ingrese la versión del juego: ");
                        int version = scanner.nextInt();

                        // Crear el objeto Juego
                        Juego juego = new Juego(titulo, genero, id, expansion, tipo, version);
                        almacen.agregarProducto(juego);
                    } else if (tipo == "pelicula") {
                        System.out.print("Ingrese el género: ");
                        String genero = scanner.nextLine();
                        System.out.print("Ingrese el ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Ingrese la expansión (si aplica): ");
                        String expansion = scanner.nextLine();
                        System.out.print("Ingrese la duración de la película (en minutos): ");
                        String duracion = scanner.next();

                        // Crear el objeto Película
                        Pelicula pelicula = new Pelicula(titulo, genero, id, expansion, tipo, duracion);
                        almacen.agregarProducto(pelicula);
                    } else if (tipo == "serie") {
                        System.out.print("Ingrese el género: ");
                        String genero = scanner.nextLine();
                        System.out.print("Ingrese el ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Ingrese la expansión (si aplica): ");
                        String expansion = scanner.nextLine();
                        System.out.print("Ingrese la cantidad de capítulos: ");
                        int cantCapitulos = scanner.nextInt();

                        // Crear el objeto Serie
                        Serie serie = new Serie(titulo, genero, id, expansion, tipo, cantCapitulos);
                        almacen.agregarProducto(serie);
                    } else {
                        System.out.println("Tipo no válido.");
                    }
                    break;


            case 2:
                    // Eliminar producto por ID
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    String eliminarId = scanner.nextLine();
                    almacen.eliminarProducto(eliminarId);
                    break;

                case 3:
                    // Mostrar todos los objetos ordenados
                    almacen.mostrarTodosOrdenados();
                    break;

                case 4:
                    // Filtrar por género
                    System.out.print("Ingrese el género para filtrar: ");
                    String generoFiltrar = scanner.nextLine();
                    almacen.filtrarPorGenero(generoFiltrar);
                    break;

                case 5:
                    // Modificar un atributo
                    System.out.print("Ingrese el ID del objeto a modificar: ");
                    String modificarId = scanner.nextLine();
                    System.out.print("Ingrese el nuevo título: ");
                    String nuevoTitulo = scanner.nextLine();
                    System.out.print("Ingrese el tipo de objeto: ");
                    String tipoModificar = scanner.nextLine();
                    almacen.modificarAtributo(modificarId, tipoModificar, nuevoTitulo);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
