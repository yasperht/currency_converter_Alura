import javax.swing.*;
import Funcionalidad.functions;
public class Main {

    public static void main(String[] args) {
        //functions converter = new functions();
        boolean flag = true;

        while (flag){
           String options = (JOptionPane.showInputDialog(null, "Seleccione un convertidor ",
                   "Conversor", JOptionPane.QUESTION_MESSAGE, null,
                   new Object[]{"Conversor De Monedas", "Conversor De Temperatura"},
                   "Seleccion")).toString();

           switch (options){
               case "Conversor De Monedas": flag = conversionResult(1); break;
               case "Conversor De Temperatura": flag = conversionResult(2); break;
           }
        }
    }

    public static boolean validationNumber(String input){
        try{
            double value = Double.parseDouble(input); //casting a double
            if (value >= 0 || value < 0){return true;}
        } catch (NumberFormatException e){return false;}
        return false;
    }

    public static boolean conversionResult (int typeConverter){
        functions converter = new functions();

        String input = JOptionPane.showInputDialog("Ingrese el valor que desee convertir :");
        if (validationNumber(input)){
            double value = Double.parseDouble(input); //Casting

            if (typeConverter == 1) {converter.ConvertidorMonedas(value);}
            else {converter.ConvertidorTemperatura(value);}

            int answer = 0;
            answer = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");

            //if ((answer == 0) && (validationNumber(input))){ }
            if (JOptionPane.OK_OPTION == answer){
                System.out.println("Seleccionando opcion afirmativa :o");
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Convertidor Terminado :)");
                return false;
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor inválido :(");
            return false;
        }
    }
}