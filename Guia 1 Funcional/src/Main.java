import javax.print.attribute.standard.NumberOfDocuments;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//Ejercicio 1
        System.out.println("Ejercicio 1 ");
        List<Integer> enteros = new ArrayList();
        List<Integer> parEnteros = new ArrayList<>();
        enteros.add(44);
        enteros.add(33);
        enteros.add(777);
        enteros.add(3);
        enteros.add(654);
        enteros.add(87);
        enteros.stream().filter(p -> p % 2 == 0).forEach(i -> parEnteros.add(i));
        parEnteros.forEach(System.out::println);


//Ejercicio 2
        System.out.println("Ejercicio 2 ");
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("hola");
        nombres.add("mundo");
        nombres.add("mouse");
        nombres.add("teclado");
        nombres.add("pantalla");

        nombres.stream().map(String :: toUpperCase).forEach(System.out::println);




//Ejercicio 3
        System.out.println("Ejercicio 3 ");
        enteros.stream().sorted().forEach(System.out::println);

//Ejercicio 4
        System.out.println("Ejercicio 4 ");
        System.out.println(enteros.stream().filter(n -> n > 7 ).count());


//Ejercicio 5
        System.out.println("Ejercicio 5 ");
        enteros.stream().limit(5).forEach(System.out::println);

        System.out.println("Ejercicio 6 ");
        nombres.stream().map(p -> p.length()).forEach(System.out::println);

        System.out.println("Ejercicio 7 ");
        String nombresConcat = nombres.stream().reduce("", String::concat);
        System.out.println(nombresConcat);

        System.out.println("Ejercicio 8 ");
        enteros.add(44);
        enteros.add(3);
        enteros.forEach(System.out::println);

        enteros.stream().distinct().forEach(System.out::println);

        System.out.println("Ejercicio 9 ");
        enteros.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);


        System.out.println("Ejercicio 10 ");
        // Agrupar palabras por su longitud
        Map<Integer, List<String>> groupedByLength = nombres.stream()
                .collect(Collectors.groupingBy(String::length));

        // Mostrar el resultado
        groupedByLength.forEach((length, wordList) -> {
            System.out.println("Longitud " + length + ": " + wordList);
        });


        System.out.println("Ejercicio 11 ");
        int product = enteros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("El producto es: " + product);

        System.out.println("Ejercicio 12 ");
        Optional<String> longestName = nombres.stream()
                .reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);
            //El caracter ? es como un if-else, si es true devuelve el primer caracter (name1) y si es false (name2)
        // Mostrar el resultado
        longestName.ifPresent(name -> System.out.println("El nombre con más caracteres es: " + name));

        System.out.println("Ejercicio 13 ");
        String ej13 = enteros.stream().map(String ::valueOf ).collect(Collectors.joining("-"));
        System.out.println(ej13);


        System.out.println("Ejercicio 14 ");
        Map<Boolean, List<Integer>> resultado = enteros.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println("Pares: " + resultado.get(true));
        System.out.println("Impares: " + resultado.get(false));


        System.out.println("Ejercicio 15 ");
        int ej15 = enteros.stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num*num)
                .reduce(0,Integer::sum);
        System.out.println(ej15);


    }






}

