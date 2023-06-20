import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, o seu valor/hora: ");
    double valorHora = scanner.nextDouble();

    System.out.println("Informe, por gentileza, quantas horas você trabalha por mês: ");
    double horasTrabalhadasPorMes = scanner.nextDouble();

    double salarioMensal = valorHora * horasTrabalhadasPorMes;

    System.out.println("O seu salário é de: " + salarioMensal + "reais.");

    scanner.close();

  }

}