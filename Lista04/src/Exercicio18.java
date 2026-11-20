import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        int[][] segunda = new int[3][3];
        System.out.println("Segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Linha " + (i + 1) + ", coluna " + (j + 1) + ": ");
                segunda[i][j] = sc.nextInt();
            }
        }
        int[][] resultado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz[i][j] + segunda[i][j];
                System.out.printf("%5d", resultado[i][j]);
            }
            System.out.println();
        }
    }
}
