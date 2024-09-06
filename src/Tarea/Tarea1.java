
package Tarea;
import java.util.Scanner;
public class Tarea1 {
 public static void main (String[]args){
 //Declarar variable
  int numero;   
Scanner lectura = new Scanner (System.in); 
String dia = "";
        // Entrada de datos  
System.out.print("Ingrese un número del 1 al 7: ");  
numero = lectura.nextInt();  
        // Proceso de datos   
        switch (numero) {  
            case 1:  
                dia = "lunes";  
                break;  
            case 2:  
                dia = "martes";  
                break;  
            case 3:  
                dia = "miércoles";  
                break;  
            case 4:  
                dia = "jueves";  
                break;  
            case 5:  
                dia = "viernes";  
                break;  
            case 6:  
                dia = "sábado";  
                break;  
            case 7:  
                dia = "domingo";  
                break;               
        }  
        System.out.println("Día de la semana: " + dia);  
 }   
}
