import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int B = scanner.nextInt();

        System.out.println();
        System.out.println("Trocando os valores...");
        System.out.println();

        int troca = A;
        A = B;
        B = troca;

        System.out.println("Agora o valor de A é: " + A);
        System.out.println("E o valor de B é: " + B);
    }
}