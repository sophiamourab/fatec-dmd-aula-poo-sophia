import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int maior = sc.nextInt();
        System.out.print("Segundo número: ");
        int segundo = sc.nextInt();
        System.out.print("Terceiro número: ");
        int terceiro = sc.nextInt();
        if (segundo > maior) {
            maior = segundo;
        }
        if (terceiro > maior) {
            maior = terceiro;
        }
        System.out.println("Maior: " + maior);
    }
}
