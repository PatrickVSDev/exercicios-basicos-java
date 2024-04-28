import java.util.Scanner;

public class A16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Início do intervalo: ");
        int inicio = scanner.nextInt();
        System.out.print("Fim do intervalo: ");
        int fim = scanner.nextInt();

        if (fim - inicio != 99) {
            System.out.println("O intervalo deve ter 100 números naturais.");
            return;
        }
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }

        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        System.out.println();
        System.out.println("Soma: " + soma);
    }
}