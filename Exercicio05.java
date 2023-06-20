import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, a quantidade de metros a ser convertida para centímetros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros / 100;

        System.out.println("A quantidade convertida é: " + centimetros + " centímetros");

        scanner.close();

    }

}