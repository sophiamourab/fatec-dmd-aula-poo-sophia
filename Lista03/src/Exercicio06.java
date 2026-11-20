import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        int maior = sc.nextInt();
        for (int i = 2; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("Maior: " + maior);
    }
}
