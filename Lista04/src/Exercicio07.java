import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }
        System.out.print("Valor procurado: ");
        int procurado = sc.nextInt();
        boolean encontrado = false;
        for (int numero : valores) if (numero == procurado) encontrado = true;
        if (encontrado) {
            System.out.println("Valor encontrado");
        } else {
            System.out.println("Valor não encontrado");
        }
    }
}
