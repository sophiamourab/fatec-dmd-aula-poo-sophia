import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }
        for (int numero : valores) {
            System.out.println(numero);
        }
    }
}
