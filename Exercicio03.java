public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, um número: ");
        double numeroUm = scanner.nextDouble();

        System.out.println("Informe, por gentileza, outro número: ");
        double numeroDois = scanner.nextDouble();

        double somaDosDoisNumeros = numeroUm + numeroDois;

        System.out.println("A soma dos dois números é: " + somaDosDoisNumeros);

        scanner.close();
    }

}
