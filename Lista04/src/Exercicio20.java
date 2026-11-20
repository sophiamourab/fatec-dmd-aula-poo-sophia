import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
            System.out.println("Coluna " + (i + 1) + ": " + somaColuna);
        }
    }
}
