import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário: R$ ");
        double salario = sc.nextDouble();
        if (salario < 0) {
            System.out.println("Salário inválido.");
            return;
        }
        double imposto;
        if (salario <= 2000) {
            imposto = 0;
        } else if (salario <= 5000) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.20;
        }
        System.out.printf("Imposto: R$ %.2f%n", imposto);
    }
}
