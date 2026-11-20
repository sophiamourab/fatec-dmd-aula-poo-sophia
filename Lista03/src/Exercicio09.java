import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número (0 a 20): ");
        int numero = sc.nextInt();
        if (numero < 0 || numero > 20) {
            System.out.println("Número fora do intervalo aceito.");
            return;
        }
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}
