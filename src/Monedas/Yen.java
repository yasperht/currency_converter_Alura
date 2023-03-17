package Monedas;

public class Yen extends money {
    public Yen () {this.description = "¥ ";}
    @Override
    public String getDescription() {return this.description;}
    @Override
    public double getCurrentPurchaseValue() {return 0.028;}
    @Override
    public double getCurrentSalesValue() {return 0.029;}
}
