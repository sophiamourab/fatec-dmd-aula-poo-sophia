public class Principal {
    public static void main(String[] args) {
        Matriz primeira = new Matriz(2, 2);
        primeira.setElemento(0, 0, 1);
        primeira.setElemento(0, 1, 2);
        primeira.setElemento(1, 0, 3);
        primeira.setElemento(1, 1, 4);
        Matriz segunda = primeira.transposta();
        System.out.println("Original:\n" + primeira);
        System.out.println("Transposta:\n" + segunda);
        primeira.adicionar(segunda);
        System.out.println("Soma:\n" + primeira);
        Matriz identidade = new Matriz(2, 2);
        identidade.setElemento(0, 0, 1);
        identidade.setElemento(1, 1, 1);
        System.out.println("É identidade: " + identidade.ehIdentidade());
        primeira.multiplicar(identidade);
        System.out.println("Multiplicada pela identidade:\n" + primeira);
    }
}
