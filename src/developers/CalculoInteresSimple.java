package developers;

public class CalculoInteresSimple {
    public static void main(String[] args) {
        //Declaraciòn de variables
        double intereses, capitalPrestado, tiempo, tasaDeInteres, tiempoEnMeses;
        
        //Inicializar variables
        intereses = 144;
        capitalPrestado = 1200;
        tasaDeInteres = 0.08;
        
        //Uso de variables 
        tiempo = intereses / (capitalPrestado * tasaDeInteres);
        tiempoEnMeses = tiempo * 12;
        System.out.println("Tiempo: " + tiempo + " años");
        System.out.println("Tiempo: " + tiempoEnMeses + " meses");
        
    }
}
