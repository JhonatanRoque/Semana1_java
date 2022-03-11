package ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SalarioHorasExtras {
    public static void main(String[] args) {
        /*
        Un trabajador de la industria de la construcción gana $10 diarios en su jornada
        normal de trabajo. En ciertas ocasiones el empleado tiene que trabajar horas
        extras para cumplir con su trabajo. En el mes ha acumulado 50 horas extras
        que se la pagan al 10% del valor del pago diario. ¿Cuanto ganara el trabajador
        al final de un mes de trabajo?
        
        Tomar en consideración que al trabajador se le descontaran el 10% en concepto de renta.
        */
        
        //Declarar variable del formato decimal
        NumberFormat formato = new DecimalFormat("#0.00");
        
        //Declarar variables
        double salarioDiario, horasExtras, TotalHorasExtra, Renta, salarioBruto, salarioNeto;
        
        //Inicializar variables
        salarioDiario = 10;
        horasExtras = salarioDiario * 0.10;
        
        //Uso de variable 
        TotalHorasExtra = horasExtras * 50;
        salarioBruto = (salarioDiario * 30) + TotalHorasExtra; 
        Renta = salarioBruto * 0.10;
        salarioNeto = salarioBruto - Renta;
        
        //Mostrar resultados
        System.out.println("Salario Diario                            : $" + formato.format(salarioDiario));
        System.out.println("Horas Extras (50)                         : $" + formato.format(TotalHorasExtra));
        System.out.println("Salario del Mes                           : $" + formato.format(salarioBruto));
        System.out.println("Renta (10%)                               : $" + formato.format(Renta));
        System.out.println("Salario Neto                              : $" + formato.format(salarioNeto));
        
        
    }
   
}
