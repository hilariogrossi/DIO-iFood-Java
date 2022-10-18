public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício Calculadora: ");
        Calculadora.somar(5, 20);
        Calculadora.subtrair(20, 5);
        Calculadora.multiplicar(20, 5);
        Calculadora.dividir(20, 5);

        // Mensagem DIA/TARDE/NOITE
        System.out.println("\nExercício Mensagem: ");
        Mensagem.hourMessage(8);
        Mensagem.hourMessage(11);
        Mensagem.hourMessage(12);
        Mensagem.hourMessage(16);
        Mensagem.hourMessage(18);
        Mensagem.hourMessage(0  );
        Mensagem.hourMessage(25);

        // Empréstimo
        System.out.println("\nExercício Empréstimo: ");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 4);

        // Quadrilátero
        System.out.println("\nExercício Quadrilátero");
        Quadrilatero.area(5);
        Quadrilatero.area(10d, 20d);
        Quadrilatero.area(10, 20, 30);
        Quadrilatero.area(10f, 20f);
    }
}
