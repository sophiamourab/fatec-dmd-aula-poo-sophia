import java.util.Scanner;

public class Exercicio12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        int jogador = jogadaJogador();
        int computador = jogadaComputador();
        mostrarResultado(verificarVencedor(jogador, computador), computador);
    }

    static void mostrarMenu() {
        System.out.println("1 - Pedra\n2 - Papel\n3 - Tesoura");
    }

    static int jogadaComputador() {
        return (int) (Math.random() * 3) + 1;
    }

    static int jogadaJogador() {
        int escolha;
        do {
            System.out.print("Sua jogada: ");
            escolha = sc.nextInt();
        } while (escolha < 1 || escolha > 3);
        return escolha;
    }

    static int verificarVencedor(int jogador, int computador) {
        if (jogador == computador) {
            return 0;
        }
        if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
                || (jogador == 3 && computador == 2)) return 1;
        return 2;
    }

    static void mostrarResultado(int resultado, int computador) {
        String[] opcoes = {"", "Pedra", "Papel", "Tesoura"};
        System.out.println("Computador escolheu " + opcoes[computador]);
        if (resultado == 0) {
            System.out.println("Empate!");
        } else {
            if (resultado == 1) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Computador venceu!");
            }
        }
    }
}
