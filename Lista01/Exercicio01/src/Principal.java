public class Principal {
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        System.out.println("Contador: " + contador.getValor());
        contador.zerar();
        System.out.println("Após zerar: " + contador.getValor());
    }
}
