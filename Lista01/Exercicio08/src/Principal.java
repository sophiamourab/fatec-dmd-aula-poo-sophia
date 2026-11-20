public class Principal {
    public static void main(String[] args) {
        Pessoa avo = new Pessoa("Maria");
        Pessoa mae = new Pessoa("Ana", null, avo);
        Pessoa filho = new Pessoa("Pedro", null, mae);
        Pessoa filha = new Pessoa("Carla", null, mae);
        System.out.println("Pedro e Carla são irmãos: " + filho.ehIrmao(filha));
        System.out.println("Maria é antecessora de Pedro: " + filho.ehAntecessor(avo));
    }
}
