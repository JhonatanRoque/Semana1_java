package developers;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AreaDeUnCirculo {
    public static void main(String[] args) {
        //Dar formato numerico
        NumberFormat formato = new DecimalFormat("#0.00");
        //Declarar variables
        double area, radio;
        final double pi = 3.1416;//La palabra final indica que este valor de la
        //variable no cambiara
        
        //inicializaciòn de las variables
        area = 145;
        //uso de variable
        radio = Math.sqrt(area/pi);//Calcular la raiz cuadrada con la funciòn Math.Sqrt
        System.out.println("Radio " + formato.format(radio) + " cm");
    }
}
