import java.util.Scanner;

public class A28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a sequência de Fibonacci: ");
        int numeroLimite = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até " + numeroLimite + ":");
        for (int i = 0; i <= numeroLimite; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}