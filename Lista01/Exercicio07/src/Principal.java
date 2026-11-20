public class Principal {
    public static void main(String[] args) {
        Continente continente = new Continente("América do Sul");
        Pais brasil = new Pais("BRA", "Brasil", 8515767);
        Pais chile = new Pais("CHL", "Chile", 756102);
        brasil.setPopulacao(200000000);
        chile.setPopulacao(19000000);
        continente.adicionarPais(brasil);
        continente.adicionarPais(chile);
        System.out.println("População total: " + continente.populacaoTotal());
        System.out.println("Dimensão total: " + continente.dimensaoTotal());
        System.out.println("Densidade: " + continente.densidadePopulacional());
        System.out.println("País mais populoso: " + continente.maiorPopulacao().getNome());
        System.out.println("País menos populoso: " + continente.menorPopulacao().getNome());
        System.out.println("Maior território: " + continente.maiorDimensao().getNome());
        System.out.println("Menor território: " + continente.menorDimensao().getNome());
        System.out.println("Razão territorial: " + continente.razaoTerritorial());
    }
}
