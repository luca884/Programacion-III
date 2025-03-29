import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Calculadora {
    public static int Cuadrado(int num){
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {

        // Parte 1 – Funciones Lambda e Interfaces Funcionales

    // Ejercicio 1: Crear una Function que duplique un número y mostrar el resultado con apply().
        Function<Integer, Integer> duplicar = numero -> numero * 2;
        System.out.println(duplicar.apply(5));

    // Ejercicio 2: Crear un, Predicate que verifique si un número es par.
        Predicate<Integer> par = num -> num % 2 == 0;                                                                 //EXPRESIONES LAMBDA
        System.out.println(par.test(5));

    // Ejercicio 3: Generar un Consumer que reciba un mensaje y lo imprima en consola.
        Consumer<String> mostrar = mensaje -> System.out.println("Mensaje " + mensaje);
        mostrar.accept("Hola munda");

// Parte 2 – Referencias a Métodos
    // Ejercicio 4: Reescribir un Consumer con una referencia a método en lugar de lambda.
        List<String> nombres = Arrays.asList("Ana", "Carlos", "Sofía");
        Consumer<String> mostrarR = System.out::println;                                                              //Los :: son los que hacen la referencia al metodo
        nombres.forEach(mostrarR);

        // Ejercicio 5: Crear un método estático llamado "cuadrado" y usarlo con Function mediante una referencia a método.
        Function<Integer, Integer> cuadrado = Calculadora::Cuadrado;
        System.out.println(cuadrado.apply(3));

// Parte 3 – API Stream (map, filter, forEach)
    // Ejercicio 6: Dada una lista de palabras, usá stream + map para imprimirlas en mayúsculas.
        nombres.stream().map(String::toUpperCase)
                .forEach(mostrarR); //Aca mando por parametro al metodo anterior que seria lo mismo que mandar System.out::println

    // Ejercicio 7: Imprimir solo las palabras que tengan más de 4 letras usando filter.
        nombres.stream().filter(palabra -> palabra.length() > 3).map(String::toLowerCase).forEach(mostrarR);

    // Ejercicio 8: Dada una lista de enteros, usá map y reduce para sumar los cuadrados.
        List<Integer> enteros = Arrays.asList(1,4,56,2,3,8,6,9,45,99);
        enteros.stream().map(num -> num * num)
                .reduce((acumulado, numero) -> acumulado + numero)
                .stream().forEach(System.out::println);

// Parte 4 – Streams combinados
    // Ejercicio 9: Convertir una lista de palabras a mayúsculas, luego filtrar las que empiezan con vocal, e imprimirlas.
        List<String> palabras = Arrays.asList("avión", "barco", "elefante", "isla", "oso", "uva", "tren");
        palabras.stream().map(String::toUpperCase).filter(p -> p.toLowerCase().startsWith("a") || p.toLowerCase().startsWith("e") ||
                p.toLowerCase().startsWith("i") || p.toLowerCase().startsWith("o") ||
                p.toLowerCase().startsWith("u")).forEach(mostrarR);


        // Parte 5 – Optional + Lambda
    // Ejercicio 10: Simular un valor que puede ser null usando Optional. Mostrar el valor si existe o un mensaje alternativo si no.
        Optional<String>  nombre = Optional.ofNullable("Hola mundo");
        System.out.println(nombre.isPresent());

    // Ejercicio 11: Usar Optional.map para obtener la longitud de una palabra, y orElse para manejar el caso vacío.
        int longitud = nombre.map(String::length).orElse(0);

        System.out.println("Longitud: " + longitud);

        // Caso cuando el Optional está vacío
        Optional<String> palabraVacia = Optional.empty();
        int longitudVacia = palabraVacia.map(String::length).orElse(0);

        System.out.println("Longitud cuando está vacío: " + longitudVacia); // Salida: 0

    }
}