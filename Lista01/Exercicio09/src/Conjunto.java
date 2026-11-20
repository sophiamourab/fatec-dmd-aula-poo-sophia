public class Conjunto {
    private String[] elementos = new String[0];

    public boolean pertence(String valor) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].equals(valor)) {
                return true;
            }
        }
        return false;
    }

    public void adicionar(String valor) {
        if (valor == null || pertence(valor)) {
            return;
        }
        String[] novos = new String[elementos.length + 1];
        for (int i = 0; i < elementos.length; i++) {
            novos[i] = elementos[i];
        }
        novos[elementos.length] = valor;
        elementos = novos;
    }

    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (String elemento : elementos) {
            resultado.adicionar(elemento);
        }
        for (String elemento : outro.elementos) {
            resultado.adicionar(elemento);
        }
        return resultado;
    }

    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (String elemento : elementos) {
            if (outro.pertence(elemento)) {
                resultado.adicionar(elemento);
            }
        }
        return resultado;
    }

    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (String elemento : elementos) {
            if (!outro.pertence(elemento)) {
                resultado.adicionar(elemento);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        String texto = "{";
        for (int i = 0; i < elementos.length; i++) {
            if (i > 0) {
                texto += ", ";
            }
            texto += elementos[i];
        }
        return texto + "}";
    }
}
