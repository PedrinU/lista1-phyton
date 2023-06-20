import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, o quanto você recebe por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o número de horas que você trabalha por mês: ");
        double horasTrabalhadasPorMes = scanner.nextDouble();

        double salarioBruto = valorPorHora * horasTrabalhadasPorMes;
        double inss = salarioBruto * 8 / 100;
        double impostoDeRenda = salarioBruto * 11 / 100;
        double sindicato = salarioBruto * 5 / 100;
        double salarioLiquido = salarioBruto - inss - impostoDeRenda - sindicato;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("IR(11%): " + impostoDeRenda);
        System.out.println("INSS(8%): " + inss);
        System.out.println("Sindicato (5%): " + sindicato);
        System.out.println("Salário Liquido: " + salarioLiquido);

        scanner.close();

    }
}