public class Principal {
    public static void main(String[] args) {
        Conjunto primeiro = new Conjunto();
        primeiro.adicionar("A");
        primeiro.adicionar("B");
        Conjunto segundo = new Conjunto();
        segundo.adicionar("B");
        segundo.adicionar("C");
        System.out.println("União: " + primeiro.uniao(segundo));
        System.out.println("Interseção: " + primeiro.inter(segundo));
        System.out.println("Diferença: " + primeiro.menos(segundo));
    }
}
