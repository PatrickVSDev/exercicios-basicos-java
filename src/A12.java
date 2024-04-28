import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor 1: ");
        int val1 = scanner.nextInt();
        System.out.print("Insira o valor 2: ");
        int val2 = scanner.nextInt();
        System.out.print("Insira o valor 3: ");
        int val3 = scanner.nextInt();

        int soma = val1 + val2 + val3;
        int quadrado = soma * soma;

        System.out.println("O valor do quadrado da soma dos três valores é " + quadrado);
    }
}