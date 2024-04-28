import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de votos válidos para o candidato A: ");
        int votosCandidatoA = scanner.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato B: ");
        int votosCandidatoB = scanner.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato C: ");
        int votosCandidatoC = scanner.nextInt();

        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite a quantidade de votos em branco: ");
        int votosEmBranco = scanner.nextInt();

        int totalEleitores = votosCandidatoA + votosCandidatoB + votosCandidatoC + votosNulos + votosEmBranco;

        double percentualVotosValidos = ((double)(votosCandidatoA + votosCandidatoB + votosCandidatoC) / totalEleitores) * 100;
        double percentualCandidatoA = ((double)votosCandidatoA / totalEleitores) * 100;
        double percentualCandidatoB = ((double)votosCandidatoB / totalEleitores) * 100;
        double percentualCandidatoC = ((double)votosCandidatoC / totalEleitores) * 100;
        double percentualVotosNulos = ((double)votosNulos / totalEleitores) * 100;
        double percentualVotosEmBranco = ((double)votosEmBranco / totalEleitores) * 100;

        System.out.println("Número total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos válidos em relação à quantidade de eleitores: " + percentualVotosValidos + "%");
        System.out.println("Percentual de votos válidos do candidato A em relação à quantidade de eleitores: " + percentualCandidatoA + "%");
        System.out.println("Percentual de votos válidos do candidato B em relação à quantidade de eleitores: " + percentualCandidatoB + "%");
        System.out.println("Percentual de votos válidos do candidato C em relação à quantidade de eleitores: " + percentualCandidatoC + "%");
        System.out.println("Percentual de votos nulos em relação à quantidade de eleitores: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos em branco em relação à quantidade de eleitores: " + percentualVotosEmBranco + "%");
    }
}