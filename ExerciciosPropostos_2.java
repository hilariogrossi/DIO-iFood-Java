package List;

import java.util.*;

/* Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre
um crime. As perguntas são:
1 - Telefonou para a vítima?
2 - Esteve no local do crime?
3 - Mora perto da vítima?
4 - Devia para a vítima?
5 - Já trabalhou com a vítima?

Se pessoa responder positivamente a 2 questões ela deve ser classificada como
"Suspeita". Entre 3 e 4 como "Cumplice" e se for 5 sim deve ser classificada como
"Assassina". Caso contrário ela será classificada como "Inocente".

 */

public class ExerciciosPropostos_2 {

    public static void main(String[] args) {

        List<String> questions = new ArrayList<String>();

        System.out.println("Perguntas Esclarecedoras\n");
        Scanner quiz = new Scanner(System.in);


        System.out.println("Telefonou para a vítima? [S/N]");
        String question_1 = quiz.next().toUpperCase();
        questions.add(question_1);
        System.out.println();

        System.out.println("Esteve no local do crime? [S/N]");
        String question_2 = quiz.next().toUpperCase();
        questions.add(question_2);
        System.out.println();

        System.out.println("Mora perto da vítima? [S/N]");
        String question_3 = quiz.next().toUpperCase();
        questions.add(question_3);
        System.out.println();

        System.out.println("Devia para a vítima? [S/N]");
        String question_4 = quiz.next().toUpperCase();
        questions.add(question_4);
        System.out.println();

        System.out.println("Já trabalhou com a vítima? [S/N]");
        String question_5 = quiz.next().toUpperCase();
        questions.add(question_5);
        System.out.println();

        System.out.println(questions);
        System.out.println();

        Iterator<String> iterator = questions.iterator();

        int counter = 0;

        while (iterator.hasNext()) {
            String sim = iterator.next();
            if (sim.contains("S")) {
                counter++;
            }

        }

        switch (counter) {
            case 2:
                System.out.println("SUPEITO DO CRIME!");
                break;

            case 3:
            case 4:
                System.out.println("CÚMPLICE DO CRIME!");
                break;

            case 5:
                System.out.println("ASSASSINO DO CRIME!");
                break;

            default:
                System.out.println("VOCÊ É INOCENTE!");
                break;

        }

    }

}
