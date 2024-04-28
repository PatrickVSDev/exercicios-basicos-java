import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor em Reais para a conversão: R$");
        double real = scanner.nextDouble();

        System.out.println("Qual a cotação do Dólar atual?");
        double cotacao = scanner.nextDouble();

        double conversao = real / cotacao;

        System.out.println("RS$" + real + " foram convertidos para US$" + conversao);
    }
}