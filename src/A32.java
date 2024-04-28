import java.util.Scanner;

public class A32 {

    public static void main(String[] args) {
        int[][] tabuleiro = new int[9][9];

        preencherTabuleiro(tabuleiro);

        if (validarSudoku(tabuleiro)) {
            System.out.println("O tabuleiro é válido!");
        } else {
            System.out.println("O tabuleiro contém valores incorretos nas seguintes células:");
            exibirCelulasIncorretas(tabuleiro);
        }
    }

    private static void preencherTabuleiro(int[][] tabuleiro) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha o tabuleiro de Sudoku (use 0 para células vazias):");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                try {
                    System.out.printf("Insira o valor para a célula (%d, %d): ", i + 1, j + 1);
                    tabuleiro[i][j] = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Por favor, insira um número inteiro.");
                    scanner.nextLine();
                    j--;
                }
            }
        }
    }


    private static boolean validarSudoku(int[][] tabuleiro) {
        return validarLinhas(tabuleiro) && validarColunas(tabuleiro) && validarBlocos(tabuleiro);
    }

    private static boolean validarLinhas(int[][] tabuleiro) {
        for (int i = 0; i < 9; i++) {
            if (!validarArray(tabuleiro[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean validarColunas(int[][] tabuleiro) {
        for (int j = 0; j < 9; j++) {
            int[] coluna = new int[9];
            for (int i = 0; i < 9; i++) {
                coluna[i] = tabuleiro[i][j];
            }
            if (!validarArray(coluna)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validarBlocos(int[][] tabuleiro) {
        for (int blocoI = 0; blocoI < 3; blocoI++) {
            for (int blocoJ = 0; blocoJ < 3; blocoJ++) {
                int[] bloco = new int[9];
                int index = 0;
                for (int i = 3 * blocoI; i < 3 * (blocoI + 1); i++) {
                    for (int j = 3 * blocoJ; j < 3 * (blocoJ + 1); j++) {
                        bloco[index++] = tabuleiro[i][j];
                    }
                }
                if (!validarArray(bloco)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validarArray(int[] array) {
        boolean[] ocorrencias = new boolean[10];

        for (int valor : array) {
            if (valor < 0 || valor > 9 || ocorrencias[valor]) {
                return false;
            }
            ocorrencias[valor] = true;
        }

        return true;
    }

    private static void exibirCelulasIncorretas(int[][] tabuleiro) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!validarCelula(tabuleiro, i, j)) {
                    System.out.printf("(%d, %d) ", i + 1, j + 1);
                }
            }
        }
        System.out.println();
    }

    private static boolean validarCelula(int[][] tabuleiro, int linha, int coluna) {
        int valor = tabuleiro[linha][coluna];
        tabuleiro[linha][coluna] = 0;
        boolean valido = validarSudoku(tabuleiro);
        tabuleiro[linha][coluna] = valor;
        return valido;
    }
}
