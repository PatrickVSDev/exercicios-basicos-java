import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o valor da hora-aula?");
        double valHoraAula = scanner.nextDouble();

        System.out.println("Tem quantas horas horas trabalhadas no mês?");
        double horas = scanner.nextDouble();

        System.out.println("Qual o valor do percentual de desconto do INSS?");
        double INSS = scanner.nextDouble();

        double salBruto = horas * valHoraAula;
        double salLiquido = salBruto - (salBruto * (INSS/100.0));

        System.out.println("O salário bruto é de R$" + salBruto);
        System.out.println("O salário líquido é de R$" + salLiquido);



    }
}