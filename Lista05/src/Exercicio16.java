import java.util.Scanner;

public class Exercicio16 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String usuario = lerDado("Usuário: ");
        String senha = lerDado("Senha: ");
        exibirAcesso(autenticar(usuario, senha));
    }

    static String lerDado(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    static boolean autenticar(String usuario, String senha) {
        return "admin".equals(usuario) && "1234".equals(senha);
    }

    static void exibirAcesso(boolean autorizado) {
        if (autorizado) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
