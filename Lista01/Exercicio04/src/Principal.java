public class Principal {
    public static void main(String[] args) {
        Reta primeira = new Reta(new Ponto2D(0, 1), new Ponto2D(2, 5));
        Reta segunda = new Reta(-1, 4);
        System.out.println("Primeira reta: " + primeira);
        System.out.println("Ponto (1, 3) pertence: " + primeira.pertence(new Ponto2D(1, 3)));
        System.out.println("Interseção: " + primeira.intersecao(segunda));
    }
}
