import java.util.Scanner;

public class Exercicio08 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = lerNome();
        int idade = lerIdade();
        String cidade = lerCidade();
        mostrarResumo(nome, idade, cidade);
    }

    static String lerNome() {
        System.out.print("Nome: ");
        return sc.nextLine();
    }

    static int lerIdade() {
        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        return idade;
    }

    static String lerCidade() {
        System.out.print("Cidade: ");
        return sc.nextLine();
    }

    static void mostrarResumo(String nome, int idade, String cidade) {
        System.out.println(nome + ", " + idade + " anos, mora em " + cidade + ".");
    }
}
