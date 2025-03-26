
public class Main {
    public static void main(String[] args) {
        guia_telefonica miGuia = new guia_telefonica();

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





    }
}