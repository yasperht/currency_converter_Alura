package Operaciones;
import Temperaturas.Celsius;
import Temperaturas.Fahrenheit;
import Temperaturas.Kelvin;
import javax.swing.*;

public class ConvertirTemperatura implements operacionConversion {
    public ConvertirTemperatura() { }

    Celsius celsius = new Celsius();
    Fahrenheit fahrenheit = new Fahrenheit();
    Kelvin kelvin = new Kelvin();

    @Override
    public void valorConvertidoExterno(double input1, double input2, String tipo) {
        int aux = 1, data = 0;
        data = (int)(aux * input2);

        if (tipo == "F" && data == 1) { // °F --> °C
           JOptionPane.showMessageDialog(null, "°F: " + input1 + " --> °C: " + fahrenheit.ValueToCalculate(input1, data));
        }
        else if (tipo == "F" && data == 2){ //°F --> °K
            JOptionPane.showMessageDialog(null, "°F: " + input1 + " --> °K: " + fahrenheit.ValueToCalculate(input1, data));
        }


        if (tipo == "K" && data == 1) { // °K --> °C
            JOptionPane.showMessageDialog(null, "°K: " + input1 + " --> °C: " + kelvin.ValueToCalculate(input1, data));
        }
        else if (tipo == "K" && data == 2) { //°K --> °F
            JOptionPane.showMessageDialog(null, "°K: " + input1 + " --> °F: " + kelvin.ValueToCalculate(input1, data));
        }
    }

    @Override
    public void valorConvertidoLocal(double input1, double input2, String tipo) {
        int aux = 1, data = 0;
        data = (int)(aux * input2);

        if (tipo == "C" && data == 1){
            JOptionPane.showMessageDialog(null, "°C: " + input1 + " --> °F: " + celsius.ValueToCalculate(input1, data));
        }
        else if (tipo == "C" && data == 2) {
            JOptionPane.showMessageDialog(null, "°C: " + input1 + " --> °K: " + celsius.ValueToCalculate(input1, data));
        }
    }
}
