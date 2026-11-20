import java.util.Scanner;

public class Exercicio14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double saldo = 0;
        int opcao;
        do {
            mostrarMenu();
            opcao = sc.nextInt();
            if (opcao == 1 || opcao == 2) {
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                if (opcao == 1) {
                    saldo = depositar(saldo, valor);
                } else {
                    saldo = sacar(saldo, valor);
                }
            } else if (opcao == 3) {
                consultarSaldo(saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        encerrarSistema();
    }

    static void mostrarMenu() {
        System.out.println("1 - Depositar\n2 - Sacar\n3 - Consultar saldo\n4 - Sair");
    }

    static double depositar(double saldo, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return saldo;
        }
        return saldo + valor;
    }

    static double sacar(double saldo, double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Saque não permitido.");
            return saldo;
        }
        return saldo - valor;
    }

    static void consultarSaldo(double saldo) {
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

    static void encerrarSistema() {
        System.out.println("Obrigado por utilizar o caixa eletrônico.");
    }
}
