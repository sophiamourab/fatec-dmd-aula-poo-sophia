import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Lado 3: ");
        double c = sc.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Não forma um triângulo.");
        else if (a == b && b == c) {
            System.out.println("Equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}
