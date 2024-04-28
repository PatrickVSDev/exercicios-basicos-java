import java.util.Scanner;

public class A23 {

    private static final String PEDRA = "pedra";
    private static final String PAPEL = "papel";
    private static final String TESOURA = "tesoura";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jogador 1, escolha:\nPedra | Papel | Tesoura\n");
        String jogada1 = scanner.nextLine().toLowerCase();

        System.out.print("Jogador 2, escolha:\nPedra | Papel | Tesoura\n");
        String jogada2 = scanner.nextLine().toLowerCase();

        Jogada jogadaJogador1 = getJogada(jogada1);
        Jogada jogadaJogador2 = getJogada(jogada2);

        Resultado resultado = getResultado(jogadaJogador1, jogadaJogador2);

        System.out.println("Resultado: " + resultado);
    }

    private static Jogada getJogada(String jogada) {
        if (jogada.equals(PEDRA)) {
            return Jogada.PEDRA;
        } else if (jogada.equals(PAPEL)) {
            return Jogada.PAPEL;
        } else if (jogada.equals(TESOURA)) {
            return Jogada.TESOURA;
        } else {
            throw new IllegalArgumentException("Jogada inválida: " + jogada);
        }
    }

    private static Resultado getResultado(Jogada jogadaJogador1, Jogada jogadaJogador2) {
        if (jogadaJogador1 == jogadaJogador2) {
            return Resultado.EMPATE;
        } else if (jogadaJogador1 == Jogada.PEDRA && jogadaJogador2 == Jogada.TESOURA) {
            return Resultado.JOGADOR_1_GANHA;
        } else if (jogadaJogador1 == Jogada.TESOURA && jogadaJogador2 == Jogada.PAPEL) {
            return Resultado.JOGADOR_1_GANHA;
        } else if (jogadaJogador1 == Jogada.PAPEL && jogadaJogador2 == Jogada.PEDRA) {
            return Resultado.JOGADOR_1_GANHA;
        } else {
            return Resultado.JOGADOR_2_GANHA;
        }
    }

    private enum Jogada {
        PEDRA, PAPEL, TESOURA
    }

    private enum Resultado {
        EMPATE, JOGADOR_1_GANHA, JOGADOR_2_GANHA
    }
}