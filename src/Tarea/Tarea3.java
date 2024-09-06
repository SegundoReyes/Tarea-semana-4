
package Tarea;
import java.util.Scanner;
public class Tarea3 {
public static void main (String []args){
  int numero;  
 Scanner lectura = new  Scanner ( System.in);
 String romano=""; 
   // Entrada de datos  
   System.out.print("Ingrese un número del 1 al 10: ");  
   numero = lectura.nextInt();  
        // Proceso de datos    
        switch (numero) {  
            case 1:  
                romano = "I";  
                break;  
            case 2:  
                romano = "II";  
                break;  
            case 3:  
                romano = "III";  
                break;  
            case 4:  
                romano = "IV";  
                break;  
            case 5:  
                romano = "V";  
                break;  
            case 6:  
                romano = "VI";  
                break;  
            case 7:  
                romano = "VII";  
                break;  
            case 8:  
                romano = "VIII";  
                break;  
            case 9:  
                romano = "IX";  
                break;  
            case 10:  
                romano = "X";  
                break;  
        }  
        // Salida de datos  
        System.out.println("Número: " + numero);  
        System.out.println("Romano: " + romano);  
       
}    
}
