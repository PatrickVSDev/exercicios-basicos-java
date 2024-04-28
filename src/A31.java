import java.util.Scanner;

public class A31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite a quantidade de colunas: ");
        int colunas = scanner.nextInt();

        quebrarLinhas(frase, colunas);

        scanner.close();
    }

    public static void quebrarLinhas(String frase, int colunas) {
        String[] palavras = frase.split(" ");
        StringBuilder linhaAtual = new StringBuilder();

        for (String palavra : palavras) {
            if (linhaAtual.length() + palavra.length() + 1 <= colunas) {
                linhaAtual.append(palavra).append(" ");
            } else {
                System.out.println(linhaAtual.toString().trim());
                linhaAtual.setLength(0);
                linhaAtual.append(palavra).append(" ");
            }
        }

        if (linhaAtual.length() > 0) {
            System.out.println(linhaAtual.toString().trim());
        }
    }
}