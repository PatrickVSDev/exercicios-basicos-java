import java.util.Scanner;

public class A24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo Pedra-papel-tesoura-lagarto-Spock!");

        System.out.print("Jogador 1, qual é a sua jogada? (pedra, papel, tesoura, lagarto, spock): ");
        String jogada1 = scanner.next();
        jogada1 = jogada1.toLowerCase();

        System.out.print("Jogador 2, qual é a sua jogada? (pedra, papel, tesoura, lagarto, spock): ");
        String jogada2 = scanner.next();
        jogada2 = jogada2.toLowerCase();

        String resultado = null;
        switch (jogada1) {
            case "pedra":
                switch (jogada2) {
                    case "papel":
                        resultado = "Jogador 2 venceu!";
                        break;
                    case "tesoura":
                        resultado = "Jogador 1 venceu!";
                        break;
                    case "lagarto":
                        resultado = "Jogador 1 venceu!";
                        break;
                    case "spock":
                        resultado = "Jogador 2 venceu!";
                        break;
                }
                break;
            case "papel":
                switch (jogada2) {
                    case "pedra":
                        resultado = "Jogador 1 venceu!";
                        break;
                    case "tesoura":
                        resultado = "Jogador 2 venceu!";
                        break;
                    case "lagarto":
                        resultado = "Jogador 2 venceu!";
                        break;
                    case "spock":
                        resultado = "Jogador 1 venceu!";
                        break;
                }
                break;
            case "tesoura":
                switch (jogada2) {
                    case "pedra":
                        resultado = "Jogador 2 venceu!";
                        break;
                    case "papel":
                        resultado = "Jogador 1 venceu!";
                        break;
                    case "lagarto":
                        resultado = "Jogador 1 venceu!";
                        break;
                    case "spock":
                        resultado = "Jogador 2 venceu!";
                        break;
                }
                break;
            case "lagarto":
                switch (jogada2) {
                    case "pedra":
                        resultado = "Jogador 1 venceu!";
                        break;
                    case "papel":
                        resultado = "Jogador 2 venceu!";
                        break;
                    case "tesoura":
                        resultado = "Jogador 2 venceu!";
                        break;
                    case "spock":
                        resultado = "Jogador 1 venceu!";
                        break;
                }
                break;
            case "spock":
                switch (jogada2) {
                    case "pedra":
                        resultado = "Jogador 2 venceu!";
                        break;
                    case "papel":
                        resultado = "Jogador 1 venceu!";
                        break;
                    case "tesoura":
                        resultado = "Jogador 1 venceu!";
                        break;
                    case "lagarto":
                        resultado = "Jogador 2 venceu!";
                        break;
                }
                break;
            default:
                resultado = "Jogada inválida!";
                break;
        }
        System.out.println(resultado);
    }
}