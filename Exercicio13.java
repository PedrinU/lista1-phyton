import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe o seu sexo biológico (M) para masculino e (F) para feminino: ");
        String sexoBiologico = scanner.next();

        if (sexoBiologico.equalsIgnoreCase("M")) {

            double pesoIdealHomem = (72.7 * altura) - 58;
            System.out.printf("O peso ideal para o seu sexo biológico é: %.2f", pesoIdealHomem);

        }

        else if (sexoBiologico.equalsIgnoreCase("F")) {

            double pesoIdealMulher = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal para o seu sexo biológico é: %.2f", pesoIdealMulher);

        }

        scanner.close();

    }

}