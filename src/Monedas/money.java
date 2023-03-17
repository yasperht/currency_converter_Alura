package Monedas;

public abstract class money {
    protected String description;
    public abstract String getDescription();
    public  abstract double getCurrentPurchaseValue(); // valor actual de compra
    public abstract double getCurrentSalesValue(); // valor actual de venta
}
