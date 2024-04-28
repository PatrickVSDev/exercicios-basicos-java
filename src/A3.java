import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do seu salário mensal: R$");
        double salario = scanner.nextDouble();

        System.out.print("Insira o valor do percentual de reajuste a ser atribuído: ");
        double percentual = scanner.nextDouble();

        double reajuste = salario + (salario * (percentual/100.0));

        System.out.println("Seu salário com reajuste vai ser de R$" + reajuste);
    }
}