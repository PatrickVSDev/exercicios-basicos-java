import java.util.Scanner;

public class A26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira string: ");
        String string1 = scanner.nextLine();
        System.out.print("Informe a segunda string: ");
        String string2 = scanner.nextLine();

        boolean saoAnagramas = verificarAnagramas(string1, string2);

        if (saoAnagramas) {
            System.out.println("As strings são anagramas.");
        } else {
            System.out.println("As strings não são anagramas.");
        }
    }

    public static boolean verificarAnagramas(String string1, String string2) {
        string1 = string1.toUpperCase();
        string2 = string2.toUpperCase();

        if (string1.length() != string2.length()) {
            return false;
        }

        int[] frequencias1 = new int[26];
        for (char letra : string1.toCharArray()) {
            frequencias1[letra - 'A']++;
        }

        int[] frequencias2 = new int[26];
        for (char letra : string2.toCharArray()) {
            frequencias2[letra - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if (frequencias1[i] != frequencias2[i]) {
                return false;
            }
        }

        return true;
    }
}