public class Continente {
    private String nome;
    private Pais[] paises = new Pais[48];
    private int quantidade;

    public Continente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPais(Pais pais) {
        if (pais == null) {
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            if (paises[i].equals(pais)) {
                return;
            }
        }
        if (quantidade >= paises.length) {
            throw new IllegalStateException("Limite de 48 países atingido.");
        }
        paises[quantidade] = pais;
        quantidade++;
    }

    public double dimensaoTotal() {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += paises[i].getDimensao();
        }
        return total;
    }

    public long populacaoTotal() {
        long total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += paises[i].getPopulacao();
        }
        return total;
    }

    public double densidadePopulacional() {
        if (quantidade == 0) {
            return 0;
        }
        return populacaoTotal() / dimensaoTotal();
    }

    public Pais maiorPopulacao() {
        if (quantidade == 0) {
            return null;
        }
        Pais maior = paises[0];
        for (int i = 1; i < quantidade; i++) {
            if (paises[i].getPopulacao() > maior.getPopulacao()) {
                maior = paises[i];
            }
        }
        return maior;
    }

    public Pais menorPopulacao() {
        if (quantidade == 0) {
            return null;
        }
        Pais menor = paises[0];
        for (int i = 1; i < quantidade; i++) {
            if (paises[i].getPopulacao() < menor.getPopulacao()) {
                menor = paises[i];
            }
        }
        return menor;
    }

    public Pais maiorDimensao() {
        if (quantidade == 0) {
            return null;
        }
        Pais maior = paises[0];
        for (int i = 1; i < quantidade; i++) {
            if (paises[i].getDimensao() > maior.getDimensao()) {
                maior = paises[i];
            }
        }
        return maior;
    }

    public Pais menorDimensao() {
        if (quantidade == 0) {
            return null;
        }
        Pais menor = paises[0];
        for (int i = 1; i < quantidade; i++) {
            if (paises[i].getDimensao() < menor.getDimensao()) {
                menor = paises[i];
            }
        }
        return menor;
    }

    public double razaoTerritorial() {
        if (quantidade == 0) {
            return 0;
        }
        return maiorDimensao().getDimensao() / menorDimensao().getDimensao();
    }
}
