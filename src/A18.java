import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra, frase ou número: ");
        String entrada = scanner.nextLine();

        entrada = entrada.replaceAll("\\s", "").toLowerCase();

        if (ePalindromo(entrada)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
    public static boolean ePalindromo(String texto) {
        int comprimento = texto.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (texto.charAt(i) != texto.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}