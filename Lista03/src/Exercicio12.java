import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                case 2:
                    System.out.print("Número 1: ");
                    double a = sc.nextDouble();
                    System.out.print("Número 2: ");
                    double b = sc.nextDouble();
                    if (opcao == 1) {
                        System.out.println("Resultado: " + (a + b));
                    } else {
                        System.out.println("Resultado: " + (a - b));
                    }
                    break;
                case 3: System.out.println("Encerrado."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }
}
