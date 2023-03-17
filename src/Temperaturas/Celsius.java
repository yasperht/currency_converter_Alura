package Temperaturas;

public class Celsius extends  temperature {

    public Celsius (){this.tipo = "C";}

    @Override
    public String getTipo() {return this.tipo;}

    @Override
    public double ValueToCalculate(double input, int data) {
        double result = 0;

        if (data == 1) { // °C --> °F
            result = input * 1.8000 + 32.00;
        }
        else { //°C --> °K
            result = input + 273.15;
        }
        return result;
    }
}
