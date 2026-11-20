public class NumeroComplexo {
    private double real;
    private double imaginaria;

    public NumeroComplexo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    public void somar(NumeroComplexo outro) {
        real += outro.real;
        imaginaria += outro.imaginaria;
    }

    public void subtrair(NumeroComplexo outro) {
        real -= outro.real;
        imaginaria -= outro.imaginaria;
    }

    public void multiplicar(NumeroComplexo outro) {
        double novoReal = real * outro.real - imaginaria * outro.imaginaria;
        double novaImaginaria = real * outro.imaginaria + imaginaria * outro.real;
        real = novoReal;
        imaginaria = novaImaginaria;
    }

    public void dividir(NumeroComplexo outro) {
        double denominador = outro.real * outro.real + outro.imaginaria * outro.imaginaria;
        if (denominador == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        double novoReal = (real * outro.real + imaginaria * outro.imaginaria) / denominador;
        double novaImaginaria = (imaginaria * outro.real - real * outro.imaginaria) / denominador;
        real = novoReal;
        imaginaria = novaImaginaria;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof NumeroComplexo)) {
            return false;
        }
        NumeroComplexo outro = (NumeroComplexo) objeto;
        return Double.compare(real, outro.real) == 0
                && Double.compare(imaginaria, outro.imaginaria) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(real) + Double.hashCode(imaginaria);
    }

    @Override
    public String toString() {
        if (imaginaria < 0) {
            return real + " - " + (-imaginaria) + "i";
        }
        return real + " + " + imaginaria + "i";
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginaria * imaginaria);
    }
}
