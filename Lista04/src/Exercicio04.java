import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }
        double soma = 0;
        for (int numero : valores) {
            soma += numero;
        }
        System.out.println("Média: " + soma / valores.length);
    }
}
