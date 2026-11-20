public class Matriz {
    private double[][] valores;

    public Matriz(int linhas, int colunas) {
        if (linhas <= 0 || colunas <= 0) {
            throw new IllegalArgumentException("Dimensões inválidas.");
        }
        valores = new double[linhas][colunas];
    }

    public int getLinhas() {
        return valores.length;
    }

    public int getColunas() {
        return valores[0].length;
    }

    public double getElemento(int linha, int coluna) {
        return valores[linha][coluna];
    }

    public void setElemento(int linha, int coluna, double valor) {
        valores[linha][coluna] = valor;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Matriz)) {
            return false;
        }
        Matriz outra = (Matriz) objeto;
        if (getLinhas() != outra.getLinhas() || getColunas() != outra.getColunas()) {
            return false;
        }
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                if (Double.compare(valores[linha][coluna], outra.valores[linha][coluna]) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int resultado = 1;
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                resultado = 31 * resultado + Double.hashCode(valores[linha][coluna]);
            }
        }
        return resultado;
    }

    public Matriz transposta() {
        Matriz resultado = new Matriz(getColunas(), getLinhas());
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                resultado.valores[coluna][linha] = valores[linha][coluna];
            }
        }
        return resultado;
    }

    public Matriz oposta() {
        Matriz resultado = new Matriz(getLinhas(), getColunas());
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                resultado.valores[linha][coluna] = -valores[linha][coluna];
            }
        }
        return resultado;
    }

    public void zerar() {
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                valores[linha][coluna] = 0;
            }
        }
    }

    public Matriz nula() {
        return new Matriz(getLinhas(), getColunas());
    }

    private boolean quadrada() {
        return getLinhas() == getColunas();
    }

    public boolean ehIdentidade() {
        if (!quadrada()) {
            return false;
        }
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                double esperado = 0;
                if (linha == coluna) {
                    esperado = 1;
                }
                if (valores[linha][coluna] != esperado) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean ehDiagonal() {
        if (!quadrada()) {
            return false;
        }
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                if (linha != coluna && valores[linha][coluna] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean ehSingular() {
        // O enunciado define singular como diagonal com valores iguais na diagonal.
        if (!ehDiagonal()) {
            return false;
        }
        for (int i = 1; i < getLinhas(); i++) {
            if (valores[i][i] != valores[0][0]) {
                return false;
            }
        }
        return true;
    }

    public boolean ehSimetrica() {
        return quadrada() && equals(transposta());
    }

    public boolean ehAntissimetrica() {
        return quadrada() && oposta().equals(transposta());
    }

    private void conferirDimensoes(Matriz outra) {
        if (getLinhas() != outra.getLinhas() || getColunas() != outra.getColunas()) {
            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões.");
        }
    }

    public void adicionar(Matriz outra) {
        conferirDimensoes(outra);
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                valores[linha][coluna] += outra.valores[linha][coluna];
            }
        }
    }

    public void subtrair(Matriz outra) {
        conferirDimensoes(outra);
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                valores[linha][coluna] -= outra.valores[linha][coluna];
            }
        }
    }

    public void multiplicar(Matriz outra) {
        if (getColunas() != outra.getLinhas()) {
            throw new IllegalArgumentException("Dimensões incompatíveis para multiplicação.");
        }
        double[][] resultado = new double[getLinhas()][outra.getColunas()];
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < outra.getColunas(); coluna++) {
                for (int i = 0; i < getColunas(); i++) {
                    resultado[linha][coluna] += valores[linha][i] * outra.valores[i][coluna];
                }
            }
        }
        valores = resultado;
    }

    public Matriz copiar() {
        Matriz copia = new Matriz(getLinhas(), getColunas());
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                copia.valores[linha][coluna] = valores[linha][coluna];
            }
        }
        return copia;
    }

    @Override
    public String toString() {
        String texto = "";
        for (int linha = 0; linha < getLinhas(); linha++) {
            for (int coluna = 0; coluna < getColunas(); coluna++) {
                texto += valores[linha][coluna] + "  ";
            }
            texto += "\n";
        }
        return texto;
    }
}
