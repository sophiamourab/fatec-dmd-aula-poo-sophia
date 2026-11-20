import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        if (!usuario.equals("admin") || !senha.equals("1234")) {
            System.out.println("Acesso negado.");
            return;
        }
        double saldo = 0;
        int opcao;
        do {
            System.out.println("1 - Ver saldo\n2 - Depositar\n3 - Sacar\n4 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: System.out.printf("Saldo: R$ %.2f%n", saldo); break;
                case 2:
                    System.out.print("Depósito: ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                    }
                    else {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Saque: ");
                    double saque = sc.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                    }
                    else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;
                case 4: System.out.println("Sessão encerrada."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}
