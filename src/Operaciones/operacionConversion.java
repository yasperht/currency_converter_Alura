package Operaciones;

public interface operacionConversion {
    /* Monedas: Valor convertido Compra --> monedaExtranjera, monedaLocal, descripción
       Temperatura: input1 -> valor a convertir
                    input2 -> operación a realizar (°C --> °F, °K--> °C, etc.)
                    description --> tipo de temperatura (°K, °C o °F).
    */

    public  void valorConvertidoExterno(double input1, double input2, String description); // Externo = $, °F, °K, ...


    /* Monedas: Valor convertido Venta --> monedaLocal, monedaExtranjera, descripción
       Temperatura: input1 -> valor a convertir
                    input2 -> operación a realizar (°C --> °F, °K--> °C, etc.)
                    description --> tipo de temperatura (°K, °C o °F).
    */
    public  void valorConvertidoLocal(double input1, double input2, String description); // Local = S/. y °C
}
