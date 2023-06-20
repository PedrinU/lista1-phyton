import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
    double tamanhoArea = scanner.nextDouble();

    double litrosTinta = tamanhoArea / 6.0;

    int latasTinta = (int) Math.ceil(litrosTinta / 18.0);
    int galoesTinta = (int) Math.ceil(litrosTinta / 3.6);
    int latasMix = (int) Math.ceil((litrosTinta * 1.1) / 18.0);
    int galoesMix = (int) Math.ceil((litrosTinta * 1.1) / 3.6);

    double precoLatas = latasTinta * 80.0;
    double precoGaloes = galoesTinta * 25.0;
    double precoMix = (latasMix * 80.0) + (galoesMix * 25.0);

    System.out.println("Situação 1: comprar apenas latas de 18 litros.");
    System.out.println("Você precisa comprar " + latasTinta + " latas de tinta.");
    System.out.println("O preço total é R$" + precoLatas);
    System.out.println("Situação 2: comprar apenas galões de 3,6 litros.");
    System.out.println("Você precisa comprar " + galoesTinta + " galões de tinta.");
    System.out.println("O preço total é R$" + precoGaloes);
    System.out.println("Situação 3: misturar latas e galões de forma que o desperdício de tinta seja menor.");
    System.out.println("Você precisa comprar " + latasMix + " latas e " + galoesMix + " galões de tinta.");
    System.out.println("O preço total é R$" + precoMix);
    scanner.close();

  }
}