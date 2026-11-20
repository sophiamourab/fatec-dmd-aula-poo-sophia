import java.util.Scanner;

public class Exercicio02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int soma = somar(10, 20);
        mostrarResultado(soma);
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static void mostrarResultado(int resultado) {
        System.out.println(resultado);
    }
}
