import java.util.Scanner;

public class A25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[0];

        int numero;
        do {
            System.out.print("Informe um número (0 para finalizar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                numeros = adicionarNumero(numeros, numero);
            }
        } while (numero != 0);

        double media = calcularMedia(numeros);

        System.out.println("A média dos números informados é: " + media);
    }

    public static int[] adicionarNumero(int[] numeros, int numero) {
        int[] novosNumeros = new int[numeros.length + 1];

        for (int i = 0; i < numeros.length; i++) {
            novosNumeros[i] = numeros[i];
        }

        novosNumeros[numeros.length] = numero;

        return novosNumeros;
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.length;

        return media;
    }
}