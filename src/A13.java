import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a distância (em metros) que o projétil percorreu?");
        double distancia = scanner.nextDouble();

        System.out.println("Qual o tempo que o projétil demorou para percorrer?");
        double tempo = scanner.nextDouble();

        double velocidade = (distancia * 1000.0) / (tempo * 60.0);

        System.out.println("A velocidade que o projétil percorreu é de " + velocidade + " metros por segundo.");
    }
}