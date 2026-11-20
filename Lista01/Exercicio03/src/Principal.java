public class Principal {
    public static void main(String[] args) {
        NumeroComplexo numero = new NumeroComplexo(3, 4);
        NumeroComplexo outro = new NumeroComplexo(1, 2);
        System.out.println("Módulo: " + numero.modulo());
        numero.somar(outro);
        System.out.println("Soma: " + numero);
        numero.subtrair(outro);
        numero.multiplicar(outro);
        System.out.println("Multiplicação: " + numero);
        numero.dividir(outro);
        System.out.println("Após dividir: " + numero);
    }
}
