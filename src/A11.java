import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor 1: ");
        int val1 = scanner.nextInt();
        System.out.print("Insira o valor 2: ");
        int val2 = scanner.nextInt();
        System.out.print("Insira o valor 3: ");
        int val3 = scanner.nextInt();

        int quadrado1 = val1 * val1;
        int quadrado2 = val2 * val2;
        int quadrado3 = val3 * val3;
        int soma = quadrado1 + quadrado2 + quadrado3;

        System.out.println("A soma dos quadrados dos três valores é: " + soma);

    }
}