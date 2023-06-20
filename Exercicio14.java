import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para calcular excesso de peso de peixes.");

        System.out.println("Informe, por gentileza, o peso de peixes (Em KG): ");
        double peso = scanner.nextDouble();

        if (peso > 50) {

            double peixesExcedente = peso - 50;
            double multaPrecoExcedente = peixesExcedente * 4.0;
            System.out.println("O valor a ser pago pelo excesso de peixes é: " + multaPrecoExcedente);
            System.out.println("João, você excedeu: " + peixesExcedente + "kg de peixes.");

        } else

            System.out.println(
                    "Parabéns João. Desta vez, não será necessário pagar multa em decorrência da quantidade de kgs de peixes.");

        scanner.close();

    }
}