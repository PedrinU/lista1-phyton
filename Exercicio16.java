import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
        double tamanhoArea = scanner.nextDouble();

        double litrosTinta = tamanhoArea / 3.0;
        int latasTinta = (int) Math.ceil(litrosTinta / 18.0);
        double precoTotal = latasTinta * 80.0;

        System.out.println("Você precisa comprar " + latasTinta + " latas de tinta.");
        System.out.println("O preço total é R$" + precoTotal);

        scanner.close();

    }
}