
public class Main {
    public static void main(String[] args) {
        guia_telefonica miGuia = new guia_telefonica();
/*
        System.out.println(miGuia.agregar("Juan Pablo", 2235418976L));
        System.out.println(miGuia.buscar("Juan Pablo"));
        System.out.println(miGuia.modificar(3232323232323223L, "Juan Pablo"));
        System.out.println(miGuia.buscar("Juan Pablo"));
        System.out.println(miGuia.borrar("Juan Pablo") + " borrado");


        Tarea tarea = new Tarea();
        tarea.agregar("terminar tp pro");
        tarea.agregar("hola mundo");
        tarea.mostrar();
        tarea.modificar("Termine el tp de progra ", 0);
        tarea.mostrar();
        tarea.eliminar(0);
        tarea.mostrar();


        Inscripciones inscripciones = new Inscripciones();
        inscripciones.agregar("luca");
        inscripciones.comparar("luca");
        inscripciones.mostrar();
        inscripciones.eliminar("luca");
        ///mjhmhjmhjmj


        // Crear instancia de la clase CatalgoOrdenado
        CatalgoOrdenado catalogo = new CatalgoOrdenado();

        // Agregar productos
        catalogo.agregarProducto("Manzana", 150.0);
        catalogo.agregarProducto("Leche", 250.0);
        catalogo.agregarProducto("Pan", 180.0);
        catalogo.agregarProducto("Yerba", 900.0);

        // Mostrar catálogo
        System.out.println("\nCatálogo inicial:");
        catalogo.mostrarCatalogo();

        // Consultar precio de un producto
        String productoConsulta = "Leche";
        System.out.println("\nEl precio de " + productoConsulta + " es $" + catalogo.obtenerPrecio(productoConsulta));

        // Actualizar precio de un producto
        catalogo.actualizarPrecio("Pan", 200.0);

        // Mostrar catálogo después de actualizar
        System.out.println("\nCatálogo después de actualizar precio:");
        catalogo.mostrarCatalogo();

        // Eliminar un producto
        catalogo.eliminaProducto("Yerba");

        // Mostrar catálogo después de eliminar
        System.out.println("\nCatálogo después de eliminar un producto:");
        catalogo.mostrarCatalogo();

*/
        // Crear el sistema de turnos
        SistemaTurnos sistema = new SistemaTurnos();

        // Agregar pacientes con diferentes niveles de prioridad
        sistema.agregarPaciente("Carlos", 3);
        sistema.agregarPaciente("Ana", 1);
        sistema.agregarPaciente("Luis", 2);
        sistema.agregarPaciente("María", 4);
        sistema.agregarPaciente("Pedro", 2);

        // Mostrar la cola de pacientes (orden según la prioridad)
        sistema.mostrarColaPacientes();

        // Atender pacientes en orden de prioridad
        System.out.println("\nAtendiendo pacientes...");
        sistema.atenderPaciente();
        sistema.atenderPaciente();
        sistema.atenderPaciente();

        // Mostrar la cola después de atender algunos pacientes
        sistema.mostrarColaPacientes();
    }




}
