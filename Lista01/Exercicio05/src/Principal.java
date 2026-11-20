public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3, new Ponto2D(2, 2));
        circulo.inflar();
        circulo.mover(4, 5);
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Centro: " + circulo.getCentro());
        System.out.println("Área: " + circulo.area());
        circulo.desinflar(2);
        System.out.println("Novo raio: " + circulo.getRaio());
    }
}
