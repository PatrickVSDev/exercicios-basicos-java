import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor inicial do intervalo: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Informe o valor final do intervalo: ");
        int valorFinal = scanner.nextInt();

        int somaPares = calcularSomaNumerosPares(valorInicial, valorFinal);

        System.out.println("A soma dos números pares no intervalo é: " + somaPares);
    }

    public static int calcularSomaNumerosPares(int inicio, int fim) {
        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        return soma;
    }
}