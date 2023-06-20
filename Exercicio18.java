import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo (em MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.print("Informe a velocidade da conexão à internet (em Mbps): ");
        double velocidadeInternet = scanner.nextDouble();

        double tamanhoEmBits = tamanhoArquivo * 8.0 * 1024.0 * 1024.0;
        double tempoEmSegundos = tamanhoEmBits / (velocidadeInternet * 1024.0 * 1024.0);
        int tempoEmMinutos = (int) Math.ceil(tempoEmSegundos / 60.0);

        System.out.println("O tempo aproximado de download é de " + tempoEmMinutos + " minutos.");

        scanner.close();

    }
}