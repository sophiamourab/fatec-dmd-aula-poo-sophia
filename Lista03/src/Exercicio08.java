import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de números: ");
        int quantidade = sc.nextInt();
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }
        double soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Número " + i + ": ");
            soma += sc.nextDouble();
        }
        System.out.printf("Média: %.2f%n", soma / quantidade);
    }
}
