package Temperaturas;

public abstract class temperature {
    protected String tipo;

    public abstract String getTipo();

    public abstract double ValueToCalculate(double input, int data);
}
