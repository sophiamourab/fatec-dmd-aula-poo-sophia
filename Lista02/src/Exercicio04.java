import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            if (a > b) {
                System.out.println("Maior: " + a);
            } else {
                System.out.println("Maior: " + b);
            }
        }
    }
}
