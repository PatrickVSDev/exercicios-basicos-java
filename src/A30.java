import java.util.Scanner;

public class A30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total a ser pago: R$ ");
        double valorTotal = scanner.nextDouble() * 100;

        System.out.print("Informe o valor efetivamente pago: R$ ");
        double valorPago = scanner.nextDouble() * 100;

        if (valorPago < valorTotal) {
            System.out.println("Valor insuficiente. Pagamento não aceito.");
        } else {
            int troco = (int) (valorPago - valorTotal);
            calcularTroco(troco);
        }

        scanner.close();
    }

    public static void calcularTroco(int troco) {
        System.out.println("Troco a ser fornecido:");

        int[] cedulasEMoedas = {10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        String[] nomeCedulaMoeda = {"R$100,00", "R$50,00", "R$10,00", "R$5,00", "R$1,00", "R$0,50", "R$0,10", "R$0,05", "R$0,01"};

        for (int i = 0; i < cedulasEMoedas.length; i++) {
            int quantidade = troco / cedulasEMoedas[i];
            if (quantidade > 0) {
                System.out.println(quantidade + " " + nomeCedulaMoeda[i]);
                troco %= cedulasEMoedas[i];
            }
        }
    }
}