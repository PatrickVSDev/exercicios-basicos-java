import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeia nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Insira a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Insira a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 5){
            System.out.println("O aluno foi Aprovado. Sua média foi de " + media);
        }else{
            System.out.println("O aluno foi Reprovado. Sua média foi de " + media);
        }
    }
}