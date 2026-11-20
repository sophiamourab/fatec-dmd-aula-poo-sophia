import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        boolean bissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
        if (bissexto) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}
