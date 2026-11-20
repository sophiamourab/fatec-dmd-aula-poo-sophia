import java.util.Scanner;

public class Exercicio03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarResultado(ehPar(lerNumero()));
    }

    static int lerNumero() {
        System.out.print("Número: ");
        return sc.nextInt();
    }

    static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    static void mostrarResultado(boolean par) {
        if (par) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }
}
