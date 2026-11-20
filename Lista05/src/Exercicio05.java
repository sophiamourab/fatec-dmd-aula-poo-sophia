import java.util.Scanner;

public class Exercicio05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        System.out.print("Operação: ");
        int opcao = sc.nextInt();
        if (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida.");
            return;
        }
        double a = lerNumero();
        double b = lerNumero();
        if (opcao == 4 && b == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return;
        }
        double resultado;
        switch (opcao) {
            case 1: resultado = somar(a, b); break;
            case 2: resultado = subtrair(a, b); break;
            case 3: resultado = multiplicar(a, b); break;
            default: resultado = dividir(a, b);
        }
        System.out.println("Resultado: " + resultado);
    }

    static void mostrarMenu() {
        System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
    }

    static double lerNumero() {
        System.out.print("Número: ");
        return sc.nextDouble();
    }

    static double somar(double a, double b) {
        return a + b;
    }
    static double subtrair(double a, double b) {
        return a - b;
    }
    static double multiplicar(double a, double b) {
        return a * b;
    }
    static double dividir(double a, double b) {
        return a / b;
    }
}
