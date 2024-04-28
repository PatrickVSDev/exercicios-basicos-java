import java.util.HashMap;
import java.util.Scanner;

public class A21 {

    private static final HashMap<Character, Integer> valores = new HashMap<>();

    static {
        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);
    }

    public static int converter(String numeral) {
        int numero = 0;

        for (int i = 0; i < numeral.length(); i++) {
            char algarismo = numeral.charAt(i);
            int valor = valores.get(Character.toUpperCase(algarismo));

            if (i < numeral.length() - 1 && valores.get(Character.toUpperCase(numeral.charAt(i + 1))) > valor) {
                numero -= valor;
            } else {
                numero += valor;
            }
        }

        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numeral romano: ");
        String numeral = scanner.nextLine();

        numeral = numeral.toUpperCase();

        int numeroConvertido = converter(numeral);

        System.out.println("O número convertido é " + numeroConvertido);
    }
}