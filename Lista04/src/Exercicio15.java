import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        int pares = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor % 2 == 0) {
                    pares++;
                }
            }
        }
        System.out.println("Pares: " + pares);
    }
}
