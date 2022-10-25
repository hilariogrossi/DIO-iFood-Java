package Set;

import java.nio.charset.CoderResult;
import java.util.*;

/*
Crie um conunto contendo as cores do arco-íris e:
a = Exiba todas as cores uma abaixo da outra
b = A quantidade de cores que o arco-íris tem
c = Exiba as cores em ordem alfabética
d = Exiba as cores na ordem inversa da que foi informada
e = Exiba todas as cores que começam com a letra "v"
f = Remova todas as cores que não começam com a letra "v"
g = Limpe o conjunto
h = Confira se o conjunto está vazio
*/

public class ExerciciosPropostosSet_1 {

    public static void main(String[] args) {

        System.out.println("Manipulando o Arco Íris: ");

        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");

        for (String cor : coresArcoIris) {
            System.out.println(cor);

        }

        System.out.println("\nA quantidade de cores que o arco-íris tem é: " + coresArcoIris.size() + " cores.");

        System.out.println("\nExiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris_1 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris_1);

        System.out.println("\nExiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresArcoIris_2 = new LinkedHashSet<>(
                Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println(coresArcoIris_2);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris_2);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("\nExiba todas as cores que começam com a letra 'V': ");
        for (String cor : coresArcoIrisList) {
            if (cor.startsWith("V")) System.out.println(cor);

        }

        System.out.println("\nRemova todas as cores que não começam com a letra 'V': ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("V")) iterator.remove();

        }

        System.out.println(coresArcoIris);

        System.out.println("\nLimpe o conjunto: ");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("\nO conjunto está vazio? " + coresArcoIris.isEmpty());

    }


}
