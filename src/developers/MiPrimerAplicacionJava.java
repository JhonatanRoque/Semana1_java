package developers;

public class MiPrimerAplicacionJava {
    public static void main(String[] args){
        //Declarar variables (Ejemplos de algunos tipos de datos)
        String nombreCompleto, direccion, estadoCivil;
        int edad;
        double gastosDiarios;
        char genero;
        boolean poseeVehiculo;
        
        //Iniciando variables 
        nombreCompleto = "Camila Esperanza Rosales";
        direccion = "Calle de la amargura desvio de la tristeza";
        estadoCivil = "Soltera";
        edad = 30;
        gastosDiarios = 34.45;
        genero = 'F';
        poseeVehiculo = false;
        
        //Uso de variables (Mostrar en pantalla las variables)
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Direcciòn:     : " + direccion);
        System.out.println("Estado Civil   : " + estadoCivil);
        System.out.println("Edad           : " + edad);
        System.out.println("Gastos Diarios : " + gastosDiarios);
        System.out.println("Genero         : " + genero);
        System.out.println("Posee Vehiculo : " + poseeVehiculo);
        
    }
}
