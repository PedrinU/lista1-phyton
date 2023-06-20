import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Informe a sua altura (Utilizar virgula caso deseje separar unidades de medida): ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O seu peso ideal é: " + pesoIdeal);

        scanner.close();

    }

}