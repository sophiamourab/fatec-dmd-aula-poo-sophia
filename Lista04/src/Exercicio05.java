import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }
        int pares = 0;
        for (int numero : valores) if (numero % 2 == 0) pares++;
        System.out.println("Quantidade de pares: " + pares);
    }
}
