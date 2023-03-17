package Monedas;

public class PesoArgentino extends money{
    public PesoArgentino (){this.description = "$ ";}
    @Override
    public String getDescription() {return this.description;}
    @Override
    public double getCurrentPurchaseValue() {return 0.0186697;}
    @Override
    public double getCurrentSalesValue() {return 53.5627;}
}
