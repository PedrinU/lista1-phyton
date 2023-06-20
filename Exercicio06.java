import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, o raio do círculo: ");
        double raioDoCirculo = scanner.nextDouble();

        double areaDoCirculo = Math.PI * Math.pow(raioDoCirculo, 2);

        System.out.println("A área do círculo é: " + areaDoCirculo);

        scanner.close();
    }

}