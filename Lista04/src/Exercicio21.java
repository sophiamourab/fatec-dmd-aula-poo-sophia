import java.util.Scanner;

public class Exercicio21 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = ' ';
            }
        }

        char jogador = 'X';
        while (true) {
            exibirTabuleiro(tabuleiro);
            realizarJogada(tabuleiro, jogador);
            if (verificarVitoria(tabuleiro, jogador)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("O jogador " + jogador + " venceu!");
                break;
            }
            if (tabuleiroCompleto(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("A partida terminou empatada!");
                break;
            }
            jogador = trocarJogador(jogador);
        }
    }

    static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("     1   2   3");
        System.out.println("   +---+---+---+");
        for (int linha = 0; linha < 3; linha++) {
            System.out.print(" " + (linha + 1) + " | ");
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " | ");
            }
            System.out.println();
            System.out.println("   +---+---+---+");
        }
    }

    static int lerPosicao(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (sc.hasNextInt()) {
                int posicao = sc.nextInt();
                if (posicao >= 1 && posicao <= 3) {
                    return posicao - 1;
                }
            } else {
                sc.next();
            }
            System.out.println("Informe um número de 1 a 3.");
        }
    }

    static void realizarJogada(char[][] tabuleiro, char jogador) {
        while (true) {
            int linha = lerPosicao("Jogador " + jogador + ", informe a linha: ");
            int coluna = lerPosicao("Jogador " + jogador + ", informe a coluna: ");
            if (posicaoValida(tabuleiro, linha, coluna)) {
                tabuleiro[linha][coluna] = jogador;
                return;
            }
            System.out.println("Essa posição já está ocupada. Escolha outra posição.");
        }
    }

    static boolean posicaoValida(char[][] tabuleiro, int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3
                && tabuleiro[linha][coluna] == ' ';
    }

    static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador
                    && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador
                    && tabuleiro[2][i] == jogador) return true;
        }
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador
                && tabuleiro[2][2] == jogador)
                || (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador
                && tabuleiro[2][0] == jogador);
    }

    static boolean tabuleiroCompleto(char[][] tabuleiro) {
        for (char[] linha : tabuleiro) {
            for (char casa : linha) if (casa == ' ') return false;
        }
        return true;
    }

    static char trocarJogador(char jogador) {
        if (jogador == 'X') {
            return 'O';
        }
        return 'X';
    }
}
