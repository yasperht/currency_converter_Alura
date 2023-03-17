package Monedas;

public class Euro extends money{
    public Euro(){this.description = "Є ";}

    @Override
    public String getDescription() {return this.description;}
    @Override
    public double getCurrentPurchaseValue() {return 4.03;}
    @Override
    public double getCurrentSalesValue() {return 0.25;}
}
