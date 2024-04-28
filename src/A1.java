import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um nome: ");
        String nome = scanner.nextLine();
        String resultado = twoFer(nome);
        System.out.println(resultado);
    }

    public static String twoFer(String nome) {
        if (nome.isEmpty()) {
            nome = "você";
        }
        return "Um para " + nome + ", um para mim!";
    }
}