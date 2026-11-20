public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this(nome, null, null);
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Pessoa)) {
            return false;
        }
        Pessoa outra = (Pessoa) objeto;
        if (!nome.equals(outra.nome)) {
            return false;
        }
        if (mae == null || outra.mae == null) {
            return mae == outra.mae;
        }
        return mae.nome.equals(outra.mae.nome);
    }

    @Override
    public int hashCode() {
        int resultado = nome.hashCode();
        if (mae != null) {
            resultado = 31 * resultado + mae.nome.hashCode();
        }
        return resultado;
    }

    public boolean ehIrmao(Pessoa outra) {
        if (outra == null || this == outra) {
            return false;
        }
        boolean mesmaMae = mae != null && outra.mae != null && mae.equals(outra.mae);
        boolean mesmoPai = pai != null && outra.pai != null && pai.equals(outra.pai);
        return mesmaMae || mesmoPai;
    }

    public boolean ehAntecessor(Pessoa pessoa) {
        if (pessoa == null) {
            return false;
        }
        if (pai == pessoa || mae == pessoa) {
            return true;
        }
        boolean antecessorDoPai = pai != null && pai.ehAntecessor(pessoa);
        boolean antecessorDaMae = mae != null && mae.ehAntecessor(pessoa);
        return antecessorDoPai || antecessorDaMae;
    }
}
