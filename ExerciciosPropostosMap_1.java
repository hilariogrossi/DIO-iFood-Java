package Map;

/*
Dada a poluçãoestimada de alguns estados do NE brasileiro faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265

-> Crie um dicionário e relacione os estados e suas populações;
-> Substitua a população do estado do RN por 3.534.165;
-> Confira se o estado PB está no dicionário, caso não esteja adicione-o com população de 4.039.277;
-> Exiba a população de PE;
-> Exiba todos os estados e suas populações na ordem em que foi informado;
-> Exiba os estados e suas populações em ordem alfabética;
-> Exiba o estado com a menor população e sua quantidade;
-> Exiba o estado com a maior população e sua quantidade;
-> Exiba a soma da população desses estados;
-> Exiba a média da população deste dicionário de estados;
-> Remova os estados com a população menor do que 4.000.000;
-> Apague o dicionário de estados;
-> Confira se o dicionário está vazio.

 */

import java.util.*;

public class ExerciciosPropostosMap_1 {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> estadosPopulacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};

        System.out.println(estadosPopulacao);

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        estadosPopulacao.put("RN", 3534165);
        System.out.println(estadosPopulacao.toString());

        System.out.println("\nConfira se o estado PB está no dicionário," +
                " caso não esteja adicione-o com população de 4.039.277: ");
        System.out.println("PB está do dicionário de estados: " + estadosPopulacao.containsKey("PB"));
        estadosPopulacao.put("PB", 4039277);
        System.out.println(estadosPopulacao.toString());
        System.out.println("PB está do dicionário de estados: " + estadosPopulacao.containsKey("PB"));

        System.out.println("\nExiba a população de PE: ");
        System.out.println("A população de PE é de " + estadosPopulacao.get("PE") + " habitantes.");

        System.out.println("\nExiba todos os estados e suas populações na ordem em que foi informado: ");
        Map<String, Integer> estadosPopulacao1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);

        }};

        System.out.println(estadosPopulacao1);

        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> estadosPopulacao2 = new TreeMap<>(estadosPopulacao1);

        System.out.println(estadosPopulacao2);

        System.out.println("\nExiba o estado com a menor população e sua quantidade: ");
        Integer menorPopulacao = Collections.min(estadosPopulacao1.values());
        Set<Map.Entry<String, Integer>> entries = estadosPopulacao1.entrySet();
        String estado = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estado = entry.getKey().toString();

                System.out.println("O estado com menor população é o " + estado
                        + " e sua população é " + menorPopulacao + ".");

            }

        }

    }
}
