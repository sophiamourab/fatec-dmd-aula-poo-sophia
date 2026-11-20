import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        int maior = matriz[0][0];
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor > maior) {
                    maior = valor;
                }
            }
        }
        System.out.println("Maior valor: " + maior);
    }
}
