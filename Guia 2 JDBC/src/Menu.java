import Modelo.Alumno;
import Modelo.DirecDAO;
import Modelo.Direccion;
import Modelo.UserDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public DirecDAO direcDAO;
    public UserDAO userDAO;
    public Alumno alumno;
    public Direccion direccion;


    public Menu (){

    }
    Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion = -1;

        do {
            System.out.println("\n--- MENÚ DE ALUMNOS ---");
            System.out.println("1. Insertar alumno");
            System.out.println("2. Insertar dirección");
            System.out.println("3. Mostrar todos los alumnos");
            System.out.println("4. Mostrar todas las direcciones");
            System.out.println("5. Buscar alumno por ID");
            System.out.println("6. Eliminar alumno por ID");
            System.out.println("7. Eliminar dirección por ID");
            System.out.println("8. Buscar dirección por ID de alumno");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea

            switch (opcion) {
                case 1:
                    InsertarAlumno();
                    break;
                case 2:
                    insertarDireccion();
                    break;
                case 3:
                    mostrarAlumnos();
                    break;
                case 4:
                    mostrarDirecionn();
                    break;
                case 5:
                    buscarAlumno();
                    break;
                case 6:
                    eliminarAlumno();
                    break;
                case 7:
                    eliminarDireccion();
                    break;
                case 8:
                    System.out.print("Ingrese el ID del alumno: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    buscarDireccion_de_alumnos(id);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);
    }



    public void InsertarAlumno(){
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del alumno: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la edad del alumno: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de línea

        System.out.print("Ingrese el email del alumno: ");
        String email = scanner.nextLine();
        alumno = new Alumno( nombre, apellido, edad, email);
        userDAO.insertarAlumno(alumno);

    }

    public void insertarDireccion(){
        System.out.print("Ingrese la calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ingrese la altura: ");
        int altura = scanner.nextInt();

        // creás la dirección con el ID del alumno que ya tenés
        Direccion direccion = new Direccion(calle, altura, alumno.getAlumno_id());
        direcDAO.insertarDireccion(direccion);
    }


    public void mostrarAlumnos(){
        userDAO.obtenerTodos();
    }

    public void mostrarDirecionn(){
        direcDAO.obtenerDirecciones();
    }


    public void buscarAlumno(){
        System.out.println("Ingrese el id del alumno");
        int id = scanner.nextInt();

        Alumno alumno1 = userDAO.buscarAlumno(id);
        alumno1.toString();
    }



    public void eliminarAlumno(){
        System.out.println("Ingrese el id del alumno");
        int id = scanner.nextInt();

        userDAO.eliminar(id);
    }


    public void eliminarDireccion(){
        System.out.println("Ingrese la direccion del alumno");
        int d = scanner.nextInt();

        direcDAO.eliminar(d);

    }


    public void buscarDireccion_de_alumnos(int id){
        List<Direccion> list = new ArrayList<>();
        list = direcDAO.direccion_X_alumnoID(id);
        list.toString();
    }



}
