public class Ponto2D implements Cloneable {
    private double x;
    private double y;

    public Ponto2D() {
        this(0, 0);
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D outro) {
        this(outro.x, outro.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void mover() {
        mover(0, 0);
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(Ponto2D outro) {
        mover(outro.x, outro.y);
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Ponto2D)) {
            return false;
        }
        Ponto2D outro = (Ponto2D) objeto;
        return Double.compare(x, outro.x) == 0 && Double.compare(y, outro.y) == 0;
    }

    @Override
    public int hashCode() {
        int resultado = Double.hashCode(x);
        resultado = 31 * resultado + Double.hashCode(y);
        return resultado;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(Ponto2D outro) {
        double diferencaX = x - outro.x;
        double diferencaY = y - outro.y;
        return Math.sqrt(diferencaX * diferencaX + diferencaY * diferencaY);
    }

    @Override
    public Ponto2D clone() {
        return new Ponto2D(this);
    }
}
