package API;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;

public class ExerciciosStreamAPI_1 {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        //numerosAleatorios.forEach(System.out::println);


        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");
        Set<String> collectList = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        //.forEach(System.out::println);


        System.out.println("\nTransforme essa lista numa lista de números inteiros: ");
        List<Integer> integersList = numerosAleatorios.stream()
                //.map(Integer::parseInt).toList();// Isso advém do de baixo:
                .map(Integer::parseInt)
                .collect(Collectors.toList());
                //.forEach(System.out::println);


        System.out.println("\nPegue os números pares e maiores que dois e coloque numa lista: ");
        List<Integer> ListaParsPlus2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> (integer % 2 == 0 && integer > 2))
                .collect(Collectors.toList());

        System.out.println(ListaParsPlus2);


        System.out.println("\nMostre a média dos números da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("\nRemova os valores ímpares da lista: ");
        integersList.removeIf(integer -> (integer % 2 != 0));

        System.out.println(integersList);


    }
}
