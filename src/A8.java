import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o comprimento: ");
        double comprimeiro = scanner.nextDouble();
        System.out.print("Insira a largura: ");
        double largura = scanner.nextDouble();
        System.out.print("Insira a altura: ");
        double altura = scanner.nextDouble();

        double volume = comprimeiro * largura * altura;

        System.out.println("O volume é " + volume);
    }
}