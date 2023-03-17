package Operaciones;
import javax.swing.*;

public class OperacionCompraVenta implements operacionConversion {

    public OperacionCompraVenta () { }
    @Override
    public void valorConvertidoExterno(double monedaExtranjera, double monedaLocal, String description) { // cualquier moneda --> sol peruano
        double operation = monedaExtranjera * monedaLocal;
        //operation = (double)Math.round(operation * 100d);
        JOptionPane.showMessageDialog(null, "Equivale a S/. " + operation);
    }

    @Override
    public void valorConvertidoLocal(double monedaLocal, double monedaExtranjera, String description) { // sol peruano --> cualquier moneda
        double operation = monedaLocal / monedaExtranjera;
        operation = (double)Math.round(operation * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Equivale a " + description + operation);
    }
}
