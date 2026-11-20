import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor para saque: R$ ");
        int valor = sc.nextInt();
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (int nota : notas) {
            int quantidade = valor / nota;
            valor %= nota;
            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$ " + nota);
            }
        }
    }
}
