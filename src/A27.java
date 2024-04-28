import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        char primeiraLetraNaoRepetida = encontrarPrimeiraLetraNaoRepetida(texto);

        if (primeiraLetraNaoRepetida != 0) {
            System.out.println("A primeira letra não repetida é: " + primeiraLetraNaoRepetida);
        } else {
            System.out.println("Não existem letras que não se repetem no texto informado.");
        }
    }

    private static char encontrarPrimeiraLetraNaoRepetida(String texto) {
        Map<Character, Integer> contagemLetras = new HashMap<>();

        for (char c : texto.toCharArray()) {
            contagemLetras.put(c, contagemLetras.getOrDefault(c, 0) + 1);
        }

        for (char c : texto.toCharArray()) {
            if (contagemLetras.get(c) == 1) {
                return c;
            }
        }

        return 0;
    }
}