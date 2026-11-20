public class Principal {
    public static void main(String[] args) {
        Ponto2D primeiro = new Ponto2D(3, 4);
        Ponto2D segundo = new Ponto2D();
        System.out.println("Primeiro ponto: " + primeiro);
        System.out.println("Distância até a origem: " + primeiro.distancia(segundo));
        Ponto2D copia = primeiro.clone();
        System.out.println("Cópia igual ao original: " + copia.equals(primeiro));
        segundo.mover(primeiro);
        System.out.println("Segundo ponto após mover: " + segundo);
    }
}
