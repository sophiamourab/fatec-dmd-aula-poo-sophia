import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entrou = false;
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.print("Usuário: ");
            String usuario = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();
            if (usuario.equals("admin") && senha.equals("1234")) {
                entrou = true;
                System.out.println("Acesso permitido");
                break;
            }
            System.out.println("Dados incorretos.");
        }
        if (!entrou) {
            System.out.println("Conta bloqueada");
        }
    }
}
