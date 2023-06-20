import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, a temperatura em graus Fahrenheit: ");
        double temperaturaEmFahrenheit = scanner.nextDouble();

        double conversaoParaGrausCelsius = 5 * ((temperaturaEmFahrenheit - 32) / 9);

        System.out.printf("A temperatura convertida de graus Fahrenheit para graus Celsius é: %.2f",
                conversaoParaGrausCelsius);

        scanner.close();

    }

}