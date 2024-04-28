import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor em Dólar para a conversão: US$");
        double dolar = scanner.nextDouble();

        System.out.println("Qual a cotação do Dólar atual?");
        double cotacao = scanner.nextDouble();

        double conversao = dolar * cotacao;

        System.out.println("US$" + dolar + " foram convertidos para R$" + conversao);
    }
}