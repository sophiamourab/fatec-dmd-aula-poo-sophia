import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Operação (+ - * /): ");
        String operacao = sc.next();
        switch (operacao) {
            case "+": System.out.println(a + b); break;
            case "-": System.out.println(a - b); break;
            case "*": System.out.println(a * b); break;
            case "/":
                if (b == 0) {
                    System.out.println("Não é possível dividir por zero.");
                }
                else {
                    System.out.println(a / b);
                }
                break;
            default: System.out.println("Operação inválida.");
        }
    }
}
