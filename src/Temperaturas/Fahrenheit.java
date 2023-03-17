package Temperaturas;

public class Fahrenheit extends temperature {

    public Fahrenheit (){this.tipo = "F";}
    @Override
    public String getTipo() {return this.tipo;}

    public double ValueToCalculate(double input, int data) {
        double result = 0;

        if (data == 1) { // °F --> °C
            result = (input - 32.00) / 1.8000;
        }
        else { //°F --> °K
            result = ((input - 32.00) / 1.8000) + 273.15;
        }
        return result;
    }
}
