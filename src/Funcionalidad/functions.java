package Funcionalidad;
import Monedas.*;
import Operaciones.OperacionCompraVenta;
import Operaciones.ConvertirTemperatura;
import javax.swing.*;

public class functions{
    public functions (){ }

    Dolar dolar  = new Dolar();
    Euro euro = new Euro();
    Libra libra = new Libra();
    Yen yen = new Yen();
    WonCoreano wonCoreano = new WonCoreano();
    PesoArgentino pesoArgentino = new PesoArgentino();

    OperacionCompraVenta operacionCompraVenta = new OperacionCompraVenta();
    ConvertirTemperatura convertirTemperatura = new ConvertirTemperatura();

    public void ConvertidorMonedas (double value){
        String option = (JOptionPane.showInputDialog(null, "Moneda a convertir :", "Convertidor Moneda",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[] {"Sol peruano (PEN) a Dolar (USD)", "Sol peruano (PEN) a Euro (EUR)", "Sol peruano (PEN) a Libra (GBP)",
                "Sol peruano (PEN) a Yen (JPY)", "Sol peruano (PEN) a Won Coreano (KRW)", "Sol peruano (PEN) a Peso Argentino (ARS)"
                , "Dolar (USD) a Sol peruano (PEN)", "Euro (EUR) a Sol peruano (PEN)", "Libra (GBP) a Sol peruano (PEN)",
                        "Yen (JPY) a Sol peruano (PEN)", "Won Coreano (KRW) a Sol peruano (PEN)","Peso Argentino (ARS) a Sol peruano (PEN)"},
                "Seleccion")).toString();


        switch (option){
            /*Sol Peruano --> Cualquier moneda*/

            case "Sol peruano (PEN) a Dolar (USD)":
            operacionCompraVenta.valorConvertidoLocal(value, dolar.getCurrentPurchaseValue(), dolar.getDescription());
            break;

            case "Sol peruano (PEN) a Euro (EUR)" :
                operacionCompraVenta.valorConvertidoLocal(value, euro.getCurrentPurchaseValue(), euro.getDescription());
                break;
            case "Sol peruano (PEN) a Libra (GBP)" :
                operacionCompraVenta.valorConvertidoLocal(value, libra.getCurrentPurchaseValue(), libra.getDescription());
                break;
            case "Sol peruano (PEN) a Yen (JPY)" :
                operacionCompraVenta.valorConvertidoLocal(value, yen.getCurrentPurchaseValue(), yen.getDescription());
                break;
            case "Sol peruano (PEN) a Won Coreano (KRW)" :
                operacionCompraVenta.valorConvertidoLocal(value, wonCoreano.getCurrentPurchaseValue(), wonCoreano.getDescription());
                break;
            case "Sol peruano (PEN) a Peso Argentino (ARS)" :
                operacionCompraVenta.valorConvertidoLocal(value, pesoArgentino.getCurrentPurchaseValue(), pesoArgentino.getDescription());
                break;


            /*Cualquier moneda --> Sol Peruano*/
            case "Dolar (USD) a Sol peruano (PEN)" :
                operacionCompraVenta.valorConvertidoExterno(value, dolar.getCurrentSalesValue(), dolar.getDescription());
                break;
            case "Euro (EUR) a Sol peruano (PEN)" :
                operacionCompraVenta.valorConvertidoExterno(value, euro.getCurrentSalesValue(), euro.getDescription());
                break;
            case "Libra (GBP) a Sol peruano (PEN)" :
                operacionCompraVenta.valorConvertidoExterno(value, libra.getCurrentSalesValue(), libra.getDescription());
                break;
            case "Yen (JPY) a Sol peruano (PEN)" :
                operacionCompraVenta.valorConvertidoExterno(value, yen.getCurrentSalesValue(), yen.getDescription());
                break;
            case "Won Coreano (KRW) a Sol peruano (PEN)" :
                operacionCompraVenta.valorConvertidoExterno(value, wonCoreano.getCurrentSalesValue(), wonCoreano.getDescription());
                break;
            case "Peso Argentino (ARS) a Sol peruano (PEN)" :
                operacionCompraVenta.valorConvertidoExterno(value, pesoArgentino.getCurrentSalesValue(), pesoArgentino.getDescription());
                break;
        }
    }

    public void ConvertidorTemperatura(double value){
        String options = (JOptionPane.showInputDialog(null, "Temperatura a convertir",
                "Conversor Temperatura", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Celsius (°C) a Farenheit (°F)", "Celsius (°C) a Kelvin (°K)", "Farenheit (°F) a Celsius (°C)",
                        "Farenheit (°F) a Kelvin (°K)", "Kelvin (°K) a Celsius (°C)", "Kelvin (°K) a Farenheit (°F)"},
                "Seleccion")).toString();

        switch (options){
            /*Temperatura local = "Celsius"*/
            /*Temperatura Externa = "Farenheit y Kelvin"*/

            case "Celsius (°C) a Farenheit (°F)":
                convertirTemperatura.valorConvertidoLocal(value, 1, "C"); break;
            case "Celsius (°C) a Kelvin (°K)":
                convertirTemperatura.valorConvertidoLocal(value, 2, "C"); break;
            case "Farenheit (°F) a Celsius (°C)" :
                convertirTemperatura.valorConvertidoExterno(value, 1, "F"); break;
            case "Farenheit (°F) a Kelvin (°K)" :
                convertirTemperatura.valorConvertidoExterno(value, 2, "F"); break;
            case "Kelvin (°K) a Celsius (°C)" :
                convertirTemperatura.valorConvertidoExterno(value, 1, "K"); break;
            case "Kelvin (°K) a Farenheit (°F)" :
                convertirTemperatura.valorConvertidoExterno(value, 2, "K"); break;
        }

    }
}
