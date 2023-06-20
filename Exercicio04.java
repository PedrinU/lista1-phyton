public class Exercicio04 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, a primeira nota bimestral: ");
        double notaBimestralUm = scanner.nextDouble();

        System.out.println("Informe, por gentileza, a segunda nota bimestral: ");
        double notaBimestralDois = scanner.nextDouble();

        System.out.println("Informe, por gentileza, a terceira nota bimestral: ");
        double notaBimestralTres = scanner.nextDouble();

        System.out.println("Informe, por gentileza, a quarta nota bimestral: ");
        double notaBimestralQuarta = scanner.nextDouble();

        double media = (notaBimestralUm + notaBimestralDois + notaBimestralTres + notaBimestralQuarta) / 4;

        System.out.println("A média das quatro notas bimestrais é: " + media);

        scanner.close();

    }
}