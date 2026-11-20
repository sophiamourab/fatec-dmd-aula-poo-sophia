import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da compra: ");
        double valor = sc.nextDouble();
        if (valor < 0) {
            System.out.println("Valor inválido.");
            return;
        }
        if (valor >= 100) {
            valor *= 0.90;
        }
        System.out.printf("Total: R$ %.2f%n", valor);
    }
}
