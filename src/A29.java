import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        if (verificarPangrama(frase)) {
            System.out.println("A frase é um pangrama.");
        } else {
            System.out.println("A frase não é um pangrama.");
        }

        scanner.close();
    }

    public static boolean verificarPangrama(String frase) {
        Set<Character> letras = new HashSet<>();

        for (char caractere : frase.toCharArray()) {
            if (Character.isLetter(caractere)) {
                letras.add(Character.toLowerCase(caractere));
            }
        }

        return letras.size() == 26;
    }
}