import java.util.Scanner;

public class Exercicio04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double media = calcularMedia(lerNota(), lerNota(), lerNota());
        mostrarResultado(media, verificarSituacao(media));
    }

    static double lerNota() {
        System.out.print("Nota: ");
        return sc.nextDouble();
    }

    static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static String verificarSituacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        }
        if (media >= 4) {
            return "Recuperação";
        }
        return "Reprovado";
    }

    static void mostrarResultado(double media, String situacao) {
        System.out.printf("Média: %.2f | %s%n", media, situacao);
    }
}
