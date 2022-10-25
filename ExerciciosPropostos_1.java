package List;

import java.util.*;

/* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e
armazene-as numa lista.
Após isto calcule a média semestral das temperaturas e mostre todas as temperaturas
acima da média e em que mês elas ocorreram (por extenso).
*/

public class ExerciciosPropostos_1 {
    public static void main(String[] args) {

        List<Double> temperaturas = new ArrayList<Double>();
        Scanner mes = new Scanner(System.in);

        int counter = 0;
        while (true) {
            if (counter == 6) break;

            System.out.println("Digite a temperatura média do " + (counter + 1) + "° mês.");
            double values = mes.nextDouble();
            temperaturas.add(values);
            counter++;

        }

        System.out.println("============================================================");
        temperaturas.forEach(t -> System.out.print(t + ", "));
        System.out.println();
        System.out.println("============================================================");
        System.out.println();

        System.out.println("Cálculo da média de 6 meses das temperaturas médias: ");
        Iterator<Double> iterator = temperaturas.iterator();

        double soma = 0d;
        while (iterator.hasNext()) {
            Double value = iterator.next();
            soma += value;

        }

        double media = soma / temperaturas.size();
        System.out.println(media);
        System.out.println("============================================================");
        System.out.println();

        Iterator<Double> iterator_1 = temperaturas.iterator();
        System.out.println("Temperaturas acima da média de 6 meses!\n");
        int counter_1 = 0;
        while (iterator_1.hasNext()) {
            Double temperatura = iterator_1.next();

            if (temperatura > media) {
                switch (counter_1) {
                    case (0):
                        System.out.printf(" 1 - Janeiro: %.1f\n ", temperatura);
                        break;

                    case (1):
                        System.out.printf("2 - Fevereiro: %.1f\n ", temperatura);
                        break;

                    case (2):
                        System.out.printf("3 - Março: %.1f\n ", temperatura);
                        break;

                    case (3):
                        System.out.printf("4 - Abril: %.1f\n ", temperatura);
                        break;

                    case (4):
                        System.out.printf("5 - Maio: %.1f\n ", temperatura);
                        break;

                    case (5):
                        System.out.printf("6 - Junho: %.1f\n ", temperatura);
                        break;

                    default:
                        System.out.println("Não houve temperatura acima da média.");


                }
            }
            counter_1++;
        }

        System.out.println("============================================================");
    }

}
