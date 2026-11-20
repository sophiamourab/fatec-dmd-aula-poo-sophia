import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }
        System.out.println("Sem repetição:");
        for (int i = 0; i < valores.length; i++) {
            boolean jaApareceu = false;
            for (int j = 0; j < i; j++) {
                if (valores[i] == valores[j]) {
                    jaApareceu = true;
                }
            }
            if (!jaApareceu) {
                System.out.print(valores[i] + " ");
            }
        }
        System.out.println();
    }
}
