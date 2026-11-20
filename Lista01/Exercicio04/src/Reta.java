public class Reta {
    private double coeficienteAngular;
    private double coeficienteLinear;

    public Reta(double coeficienteAngular, double coeficienteLinear) {
        this.coeficienteAngular = coeficienteAngular;
        this.coeficienteLinear = coeficienteLinear;
    }

    public Reta(Ponto2D primeiro, Ponto2D segundo) {
        double diferencaX = segundo.getX() - primeiro.getX();
        if (diferencaX == 0) {
            // A forma y = ax + b não representa retas verticais.
            throw new IllegalArgumentException("Os pontos formam uma reta vertical.");
        }
        coeficienteAngular = (segundo.getY() - primeiro.getY()) / diferencaX;
        coeficienteLinear = primeiro.getY() - coeficienteAngular * primeiro.getX();
    }

    public double getCoeficienteAngular() {
        return coeficienteAngular;
    }

    public void setCoeficienteAngular(double coeficienteAngular) {
        this.coeficienteAngular = coeficienteAngular;
    }

    public double getCoeficienteLinear() {
        return coeficienteLinear;
    }

    public void setCoeficienteLinear(double coeficienteLinear) {
        this.coeficienteLinear = coeficienteLinear;
    }

    public boolean pertence(Ponto2D ponto) {
        double yCalculado = coeficienteAngular * ponto.getX() + coeficienteLinear;
        return Math.abs(ponto.getY() - yCalculado) < 0.0000001;
    }

    @Override
    public String toString() {
        return "y = " + coeficienteAngular + "x + " + coeficienteLinear;
    }

    public Ponto2D intersecao(Reta outra) {
        double diferenca = coeficienteAngular - outra.coeficienteAngular;
        if (Math.abs(diferenca) < 0.0000001) {
            return null;
        }
        double x = (outra.coeficienteLinear - coeficienteLinear) / diferenca;
        double y = coeficienteAngular * x + coeficienteLinear;
        return new Ponto2D(x, y);
    }
}
