public class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private Pais[] fronteiras = new Pais[40];
    private int quantidadeFronteiras;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        setDimensao(dimensao);
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        if (populacao < 0) {
            throw new IllegalArgumentException("População inválida.");
        }
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        if (dimensao <= 0) {
            throw new IllegalArgumentException("A dimensão deve ser positiva.");
        }
        this.dimensao = dimensao;
    }

    public void adicionarFronteira(Pais vizinho) {
        if (vizinho == null || equals(vizinho) || fazFronteira(vizinho)) {
            return;
        }
        if (quantidadeFronteiras >= fronteiras.length) {
            throw new IllegalStateException("Limite de 40 fronteiras atingido.");
        }
        fronteiras[quantidadeFronteiras] = vizinho;
        quantidadeFronteiras++;
    }

    public boolean fazFronteira(Pais outro) {
        for (int i = 0; i < quantidadeFronteiras; i++) {
            if (fronteiras[i].equals(outro)) {
                return true;
            }
        }
        return false;
    }

    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    public Pais[] vizinhosComuns(Pais outro) {
        Pais[] encontrados = new Pais[40];
        int quantidade = 0;
        for (int i = 0; i < quantidadeFronteiras; i++) {
            Pais vizinho = fronteiras[i];
            if (outro.fazFronteira(vizinho)) {
                encontrados[quantidade] = vizinho;
                quantidade++;
            }
        }
        Pais[] resultado = new Pais[quantidade];
        for (int i = 0; i < quantidade; i++) {
            resultado[i] = encontrados[i];
        }
        return resultado;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Pais)) {
            return false;
        }
        Pais outro = (Pais) objeto;
        return codigoISO.equals(outro.codigoISO);
    }

    @Override
    public int hashCode() {
        return codigoISO.hashCode();
    }
}
