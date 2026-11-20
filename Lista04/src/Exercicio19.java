import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        boolean identidade = true;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (linha == coluna && matriz[linha][coluna] != 1) {
                    identidade = false;
                } else if (linha != coluna && matriz[linha][coluna] != 0) {
                    identidade = false;
                }
            }
        }
        if (identidade) {
            System.out.println("É matriz identidade");
        } else {
            System.out.println("Não é matriz identidade");
        }
    }
}
