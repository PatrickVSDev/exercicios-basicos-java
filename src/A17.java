import java.util.Scanner;

public class A17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o número da posição " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Array ordenado em ordem decrescente:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}