package Monedas;

public class Dolar extends money {
    public Dolar() {this.description = "US$ ";}

    @Override
    public String getDescription() {return this.description;}

    @Override
    public double getCurrentPurchaseValue() {return 3.7730;} // dolar a sol

    @Override
    public double getCurrentSalesValue() {return 3.8010;} // sol a dolar
}
