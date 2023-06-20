public class Exercicio02 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, um número: ");
        double numero = scanner.nextDouble();

        System.out.println("O número informado é: " + numero);

        scanner.close();

    }

}
