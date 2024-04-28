import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int numeroInicial = scanner.nextInt();
        System.out.print("Informe o número final: ");
        int numeroFinal = scanner.nextInt();

        if (numeroFinal <= numeroInicial) {
            System.out.println("O número final deve ser maior que o número inicial.");
            return;
        }

        fizzBuzz(numeroInicial, numeroFinal);
    }

    public static void fizzBuzz(int numeroInicial, int numeroFinal) {
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}