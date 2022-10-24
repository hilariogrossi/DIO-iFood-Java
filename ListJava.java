package List;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {
        //List notas = new ArrayList<>(); antes do java 5
        //List<Double> notas = new ArrayList<>(); forma genérica
        //ArrayList<Double> notas = new ArrayList<>(); NÃO RECOMENDADO
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); NÃO SE CONSEGUE ACRESCENTAR NADA
        //List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); LISTA IMUTÁVEL

        //QUAL FORMA USAR?
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas); // ou (notas.toString)
        System.out.println(" ");

        System.out.println("Exiba a posição da nota 5.0: ");
        // Utiliza-se o método indexOf do próprio Java
        System.out.println("A posição da nota 5.0 no Array é: " + notas.indexOf(5d));
        System.out.println(" ");

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        // Utiliza-se o mesmo método add, porém passando os parâmetros add(posição, valor)
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        // Utiliza-se o método de substituição set
        notas.set(3, 6d); //set(posição, valor) ou notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Confira se a nota 5.0 está na lista: ");
        // Utiliza-se o método conferência contains
        System.out.println("A lista contém ou não a nota 5.0? " + notas.contains(5.0));
        System.out.println(" ");

/*
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        System.out.println(notas);
        System.out.println(" ");

        for (Double nota : notas) {
            System.out.println(nota);
        }
        System.out.println(" ");
*/

        System.out.println("Exiba a 3a. nota adicionada: ");
        // Utiliza-se o método get
        System.out.println("A terceira nota na lista é: " + notas.get(2));
        System.out.println(" ");

        System.out.println("Exiba a menor nota: ");
        // Utiliza-se o método Collections.min()
        System.out.println("A MENOR nota é : " + Collections.min(notas));
        System.out.println(" ");

        System.out.println("Exiba a maior nota: ");
        // Utiliza-se o método Colletions.max()
        System.out.println("A MAIOR nota é : " + Collections.max(notas));
        System.out.println(" ");

        System.out.println("Exiba a soma dos valores: ");
        // Utiliza-se o método iterator(), pois não existe em Java o SUM
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos números da lista é: " + soma);
        System.out.println(" ");

        System.out.println("Exiba a média das notas: ");
        // A quantidade é determinada por size
        System.out.println("A média da notas é: " + (soma/notas.size()));
        System.out.println(" ");

        System.out.println("Remova a nota zero (0.0)");
        System.out.println(notas);
        notas.remove(0.0); // ou 0d
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Remova a nota na posição 0: ");
        System.out.println(notas);
        notas.remove(0);
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Remova as notas menores do que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }

        }
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Apague toda a lista: ");
        // Utiliza-se o método clear()
        notas.clear();
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Confira de a lista está vazia: ");
        // Utiliza-se o método isEmpty()
        System.out.println("A lista está vazia? " + notas.isEmpty());

    }
}
