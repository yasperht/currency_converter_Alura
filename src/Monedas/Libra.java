package Monedas;

public class Libra extends money{
    public Libra(){this.description = "£ ";}

    @Override
    public String getDescription(){return this.description;}
    @Override
    public double getCurrentPurchaseValue() {return 3.774;}
    @Override
    public double getCurrentSalesValue() {return 4.876;}
}
