import java.util.Scanner;

public class Exercicio15 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarJogo();
        String nome = criarJogador();
        mostrarMenu();
        if (sc.nextInt() != 1) {
            return;
        }
        int acertos = 0;
        if (executarTurno("Quanto é 3 + 4?", 7)) {
            acertos++;
        }
        if (executarTurno("Quanto é 5 x 2?", 10)) {
            acertos++;
        }
        if (executarTurno("Quanto é 12 / 3?", 4)) {
            acertos++;
        }
        encerrarJogo(nome, acertos);
    }

    static void iniciarJogo() {
        System.out.println("Quiz: acerte 3 perguntas!");
    }

    static void mostrarMenu() {
        System.out.println("Digite 1 para jogar ou 0 para sair:");
    }

    static String criarJogador() {
        System.out.print("Nome: ");
        return sc.nextLine();
    }

    static boolean executarTurno(String pergunta, int resposta) {
        System.out.println(pergunta);
        return sc.nextInt() == resposta;
    }

    static boolean verificarVitoria(int acertos) {
        return acertos >= 2;
    }

    static void encerrarJogo(String nome, int acertos) {
        System.out.println(nome + ", você acertou " + acertos + " de 3.");
        if (verificarVitoria(acertos)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Tente novamente!");
        }
    }
}
