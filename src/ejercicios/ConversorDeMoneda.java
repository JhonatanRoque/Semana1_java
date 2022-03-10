
package ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConversorDeMoneda {
    /*
    Nos piden hacer un programa que calcule el valor de la moneda pàra los siguientes
    paìses: Europa, Reino Unido, Australia y Canada. El programa tiene declarada 
    una variable con el valor de $100.00 de tipo double y tenemos que realizar la 
    conversion de dolares a las monedas solicitadas. A continuaciòn se muestra 
    los valores de conversion
    
    1 USD  0.70 Europa  0.61 Reindo Unido   0.95 Australia   0.97 Canada
    */
    
    public static void main(String[] args) {
        //Declaracion de formato de decimal
        NumberFormat formato = new DecimalFormat("#0.00");
        //Declaraciòn de variable 
        double Dinero, USD, Euro, LbEtln, DAust, DCanad;
        
        //Inicializaciòn de variable
        Dinero = 100.00;
        USD = 1;
        Euro = 0.70;
        LbEtln = 0.61;
        DAust = 0.95;
        DCanad = 0.97;
        
        //uso de variables
        USD = Dinero * USD;
        Euro = Dinero * Euro;
        LbEtln = Dinero * LbEtln;
        DAust = Dinero * DAust;
        DCanad = Dinero * DCanad;
        
        //Mostrar resultados
        System.out.println("La cantidad de dinero es de  : " + Dinero );
        System.out.println("En monedad Estadounidense es : " + formato.format(USD) + " USD" );
        System.out.println("En monedad Europea es        : " + formato.format(Euro) + " Euros" );
        System.out.println("En monedad del Reino Unido es: " + formato.format(LbEtln) + " Libras Esterlinas" );
        System.out.println("En monedad Australiana es    : " + formato.format(DAust) + " Dolar Australiano" );
        System.out.println("En monedad Canadiense es: " + formato.format(DCanad) + " Dolar Canadiense" );
        
    }
}