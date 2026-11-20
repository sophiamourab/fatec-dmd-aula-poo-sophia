import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        for (int coluna = 0; coluna < 3; coluna++) {
            for (int linha = 0; linha < 3; linha++) {
                System.out.printf("%5d", matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
