package ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SueldoDocente {
    /*
    Un docente universitario gana $8.00 la hora de la clase y ha impartido 36 horas
    en un mes de clases. Debemos de calcular el salario del docente sabiendo que le van a 
    descontar el 10% de la renta. ¿Cuanto ganara el docente al final de un mes de clases
    menos el descuento de su renta?
    */
    public static void main(String[] args) {
        //Declarar formato de decimal
        NumberFormat formato = new DecimalFormat("#0.00");
        //Declaraciòn de varables
        double SalarioHora, Renta, SalarioMensualBruto, SalarioMensualNeto;
        int horasTrabajadas;
        
        //Inicializacion de variables
        SalarioHora = 8.00;
        Renta = 0.10;
        horasTrabajadas = 36;
        
        //Uso de variables
        SalarioMensualBruto = SalarioHora * horasTrabajadas;
        Renta = SalarioMensualBruto * Renta;
        SalarioMensualNeto = SalarioMensualBruto - Renta;
        
        //Mostrar datos de salida
        System.out.println("Salario hora         : $" + SalarioHora );
        System.out.println("Horas trabajadas     :  " + horasTrabajadas );
        System.out.println("Salario Bruto        : $" + SalarioMensualBruto );
        System.out.println("Renta (0.10%)        :  " + Renta );
        System.out.println("Salario Neto (SB - R): $" + SalarioMensualNeto);
        
    }
}
