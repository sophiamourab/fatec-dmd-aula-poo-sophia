import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Linha " + (linha + 1) + ", coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        System.out.print("Valor procurado: ");
        int buscado = sc.nextInt();
        boolean encontrou = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == buscado) {
                    System.out.println("Linha " + (i + 1) + ", coluna " + (j + 1));
                    encontrou = true;
                }
            }
        }
        if (!encontrou) {
            System.out.println("Valor não encontrado");
        }
    }
}
