import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;
        do {
            System.out.print("Número (0 encerra): ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);
        System.out.println("Soma total: " + soma);
    }
}
