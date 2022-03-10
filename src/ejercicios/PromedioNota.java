package ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class PromedioNota {
    public static void main(String[] args) {
        /*
        Un estudiante de del ITCA tiene 5 evaluaciones en cada ciclo de estudio. 
        La primera evaluación tiene una ponderación del 25% de la nota final, la
        segunda evaluaciòn tiene un 15% de la nota final, la tercera evaluaciòn
        tiene un 15% de la nota final, la cuarta evaluaciòn tiene un 20% de la 
        nota final y la quinta evaluaciòn tiene un 25% del valor de la nota final.
        
        Si el estudiante obtuvo las siguientes calificaciones:
        
        parcial 1:8.0, parcial 2:7.5, parcial 3:9.0, parcial 4: 8.0, parcial 5:9.0
        */
        //Declarar formato de decimal
        NumberFormat formato = new DecimalFormat("#0.00");
        
        //Declarar variables
        double p1, p2, p3, p4, p5, pm;
        
        //Inicializar las variables
        p1 = 8.0;
        p2 = 7.5;
        p3 = 9.0;
        p4 = 8.0;
        p5 = 9.0;
        
        pm = ((p1*0.25)+(p2*0.15)+(p3*0.15)+(p4*0.20)+(p5*0.25));
        
        System.out.println("El promedio final es: " + formato.format(pm));
    }
}
