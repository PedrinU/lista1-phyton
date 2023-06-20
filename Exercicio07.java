import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, o valor de um lado do quadrado: ");
        double ladoUm = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o valor do outro lado do quadrado: ");
        double ladoDois = scanner.nextDouble();

        double areaDoQuadrado = ladoUm * ladoDois;

        System.out.println("O valor da área do quadrado é: " + areaDoQuadrado);
        System.out.println("O valor do dobro da área do quadrado é: " + areaDoQuadrado * 2);

        scanner.close();

    }

}