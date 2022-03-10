package ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class DescuentosAFP {
    public static void main(String[] args) {
        /*
        Si un trabajador de la empresa esta afiliado a las AFP y los porcentajes
         que se paga es de 6% por parte del trabajador y 6.5% Por parte del empleador,
        si el empleado gana $500 al mes, ¿Cuanto está pagando a la AFP el trabajador
        en conceptop de empleado y de empleador?
        */
        //Declaración de formato
        NumberFormat formato = new DecimalFormat("#0.00");
        
        //Declaración de variables
        double sueldoBruto, sueldoNeto, AfpEmpl, AfpEmpldor;
        
        //Inicializar las variables
        sueldoBruto = 500;
        
        //Udo de variables
        AfpEmpl = sueldoBruto * 0.06;
        AfpEmpldor = sueldoBruto * 0.065;
        sueldoNeto = sueldoBruto - AfpEmpl;
        
        //Mostrar resultados en pantalla
        System.out.println("El salario Bruto es                        : " + sueldoBruto);
        System.out.println("Lo que paga el empleado en AFP es (6%)     : " + formato.format(AfpEmpl));
        System.out.println("Lo que paga el empleador en AFP es (6.5%)  : " + formato.format(AfpEmpldor));
        System.out.println("El trabajador en Conepto AFP paga (afpEmpleado + afpEmpleadoR  : " + formato.format(AfpEmpl + AfpEmpldor));
        System.out.println("El salario Neto del empleado es            : " + formato.format(sueldoNeto));
        
        
    }
    
}
