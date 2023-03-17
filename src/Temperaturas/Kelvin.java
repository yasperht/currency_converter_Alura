package Temperaturas;

public class Kelvin extends temperature {

    public Kelvin (){this.tipo = "K";}
    @Override
    public String getTipo() {return this.tipo;}

    public double ValueToCalculate(double input, int data) {
        double result = 0;

        if (data == 1) { // °K --> °C
            result = input - 273.15;
        }
        else { //°K --> °F
            result = ((input - 273.15) * 1.8000) + 32.00;
        }
        return result;
    }
}
