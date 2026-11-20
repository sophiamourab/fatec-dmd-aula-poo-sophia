import java.util.Scanner;

public class Exercicio07 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarNumeros();
        mostrarPares();
        mostrarImpares();
    }

    static void mostrarNumeros() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void mostrarPares() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void mostrarImpares() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
