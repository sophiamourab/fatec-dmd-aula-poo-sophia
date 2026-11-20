import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][2 - i];
        }
        System.out.println("Diagonal secundária: " + soma);
    }
}
