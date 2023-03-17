package Monedas;

public class WonCoreano extends money{
    public WonCoreano (){this.description = "₩ ";}

    @Override
    public String getDescription() {return this.description;}
    @Override
    public double getCurrentPurchaseValue() {return 0.0029;}
    @Override
    public double getCurrentSalesValue() {return 346.15;}
}
