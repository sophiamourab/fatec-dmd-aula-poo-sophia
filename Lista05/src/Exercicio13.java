import java.util.Scanner;

public class Exercicio13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int vida = criarPersonagem();
        int opcao;
        do {
            mostrarStatus(vida);
            System.out.println("1 - Enfrentar inimigo\n2 - Curar\n3 - Sair");
            opcao = sc.nextInt();
            if (opcao == 1) {
                int dano = atacar();
                System.out.println("O inimigo causou " + dano + " pontos de dano.");
                vida = receberDano(vida, dano);
            } else if (opcao == 2) {
                vida = curar(vida);
            } else if (opcao != 3) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 3 && vida > 0);
        if (vida == 0) {
            System.out.println("Fim de jogo!");
        }
    }

    static int criarPersonagem() {
        return 100;
    }

    static void mostrarStatus(int vida) {
        System.out.println("Vida atual: " + vida);
    }

    static int atacar() {
        return 10 + (int) (Math.random() * 11);
    }

    static int receberDano(int vida, int dano) {
        int novaVida = vida - dano;
        if (novaVida < 0) {
            novaVida = 0;
        }
        return novaVida;
    }

    static int curar(int vida) {
        int novaVida = vida + 20;
        if (novaVida > 100) {
            novaVida = 100;
        }
        return novaVida;
    }
}
