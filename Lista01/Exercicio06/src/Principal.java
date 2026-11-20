public class Principal {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8515767);
        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        Pais uruguai = new Pais("URY", "Uruguai", 176215);
        brasil.setPopulacao(200000000);
        brasil.adicionarFronteira(argentina);
        brasil.adicionarFronteira(uruguai);
        argentina.adicionarFronteira(uruguai);
        System.out.println("Densidade do Brasil: " + brasil.densidadePopulacional());
        System.out.println("Brasil faz fronteira com Argentina: " + brasil.fazFronteira(argentina));
        System.out.println("Vizinhos em comum: " + brasil.vizinhosComuns(argentina).length);
    }
}
