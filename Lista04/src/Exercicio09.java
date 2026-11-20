import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[j] < valores[i]) {
                    int temporario = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temporario;
                }
            }
        }
        for (int numero : valores) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
