
package Tarea;
import java.util.Scanner;
public class Tarea4 {
public static void main (String [] args){
 int numero;   
Scanner lectura = new Scanner (System.in); 
String ingles="";
        // Entrada de datos  
        System.out.print("Ingrese un número del 1 al 6: ");  
        numero = lectura.nextInt();  
        // Proceso de datos    
        switch (numero) {  
            case 1:  
                ingles = "one";  
                break;  
            case 2:  
                ingles = "two";  
                break;  
            case 3:  
                ingles = "three";  
                break;  
            case 4:  
                ingles = "four";  
                break;  
            case 5:  
                ingles = "five";  
                break;  
            case 6:  
                ingles = "six";  
                break;   
        }  
        // Salida de datos  
        System.out.println("Número: " + numero);  
        System.out.println("Inglés: " + ingles);  
     
}    
}
