import java.util.Scanner;

public class Exercicio10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarResultado(validarLogin(lerUsuario(), lerSenha()));
    }

    static String lerUsuario() {
        System.out.print("Usuário: ");
        return sc.nextLine();
    }

    static String lerSenha() {
        System.out.print("Senha: ");
        return sc.nextLine();
    }

    static boolean validarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }

    static void mostrarResultado(boolean autorizado) {
        if (autorizado) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
