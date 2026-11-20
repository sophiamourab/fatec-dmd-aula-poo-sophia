import java.util.Scanner;

public class Exercicio06 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        exibirTabuada(lerNumero());
    }

    static int lerNumero() {
        System.out.print("Número: ");
        return sc.nextInt();
    }

    static void mostrarLinha(int numero, int multiplicador) {
        System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);
    }

    static void exibirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            mostrarLinha(numero, i);
        }
    }
}
