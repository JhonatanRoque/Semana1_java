package ejercicios;

     import java.text.DecimalFormat;
    import java.text.NumberFormat;

public class Resistencia_Equivalente {
    /*
     Se tienen 4 resistencias en paralelo R1 = 5.1 ohm, R2 = 68 ohm,
    R3 = 75 ohm y R4 = 82 ohm; obtener la resistencia equivalente
    
    */
    public static void main(String[] args) {
        //Declaraciòn de formato de decimal
        NumberFormat formato = new DecimalFormat("#0.00");
        //Declaraciòn de variable
        double Rest1, Rest2, Rest3, Rest4, RestE;
        
        //Inicializaciòn de variables
        Rest1 = 5.1;
        Rest2 = 68;
        Rest3 = 75;
        Rest4 = 82;
        
        //uso de variable
        RestE = 1 /((1/Rest1)+(1/Rest2)+(1/Rest3)+(1/Rest4));
        
        //Mostrar resultado
        System.out.println("Resistencia 1:  " + Rest1 + " ohm");
        System.out.println("Resistencia 2:  " + Rest2 + " ohm");
        System.out.println("Resistencia 3:  " + Rest3 + " ohm");
        System.out.println("Resistencia 4:  " + Rest4 + " ohm");
        System.out.println("Resistencia Equivalente:  " + formato.format(RestE) + " ohm");
    }
    
}
