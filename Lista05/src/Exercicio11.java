import java.util.Scanner;

public class Exercicio11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = sortearNumero();
        int tentativas = 0;
        while (true) {
            int palpite = lerPalpite();
            tentativas++;
            if (verificarAcerto(palpite, numero)) { mostrarVitoria(tentativas); break; }
            mostrarDica(palpite, numero);
        }
    }

    static int sortearNumero() {
        return (int) (Math.random() * 100) + 1;
    }

    static int lerPalpite() {
        System.out.print("Seu palpite (1 a 100): ");
        return sc.nextInt();
    }

    static boolean verificarAcerto(int palpite, int numero) {
        return palpite == numero;
    }

    static void mostrarDica(int palpite, int numero) {
        if (palpite < numero) {
            System.out.println("Tente um número maior.");
        } else {
            System.out.println("Tente um número menor.");
        }
    }

    static void mostrarVitoria(int tentativas) {
        System.out.println("Acertou em " + tentativas + " tentativas!");
    }
}
