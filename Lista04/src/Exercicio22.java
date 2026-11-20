import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        boolean semRepeticoes = true;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                for (int outraLinha = 0; outraLinha < 3; outraLinha++) {
                    for (int outraColuna = 0; outraColuna < 3; outraColuna++) {
                        boolean mesmaPosicao = linha == outraLinha && coluna == outraColuna;
                        boolean jaComparada = outraLinha < linha
                                || (outraLinha == linha && outraColuna < coluna);
                        if (!mesmaPosicao && !jaComparada
                                && matriz[linha][coluna] == matriz[outraLinha][outraColuna]) {
                            semRepeticoes = false;
                        }
                    }
                }
            }
        }
        if (semRepeticoes) {
            System.out.println("Não há valores repetidos");
        } else {
            System.out.println("Há valores repetidos");
        }
    }
}
