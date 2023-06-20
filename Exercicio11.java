import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, um número real: ");
        double numeroReal = scanner.nextDouble();

        System.out.println("Informe, por gentileza, um número inteiro: ");
        int primeiroNumeroInteiro = scanner.nextInt();

        System.out.println("Informe, por gentileza, um número inteiro: ");
        int segundoNumeroInteiro = scanner.nextInt();

        double resultadoA = (primeiroNumeroInteiro * 2) * (segundoNumeroInteiro / 2);
        double resultadoB = (primeiroNumeroInteiro * 3) + numeroReal;
        double resultadoC = Math.pow(segundoNumeroInteiro, 3);

        System.out.println("O resultado do produto do dobro do primeiro com metade do segundo: " + resultadoA);
        System.out.println("A soma do triplo do primeiro núm com o terceiro: " + resultadoB);
        System.out.println("o terceiro número elevado ao cubo: " + resultadoC);

        scanner.close();

    }

}