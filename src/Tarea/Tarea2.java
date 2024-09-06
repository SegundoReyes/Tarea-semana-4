
package Tarea;
import java.util.Scanner;
public class Tarea2 {
 public static void main(String[] args){
 int numero;    
 Scanner lectura = new Scanner (System.in);
  String palabra="";
        // Entrada de datos  
        System.out.print("Ingrese un número del 1 al 5: ");  
        numero = lectura.nextInt();  
        // Proceso de datos    
        switch (numero) {  
            case 1:  
                palabra = "uno";  
                break;  
            case 2:  
                palabra = "dos";  
                break;  
            case 3:  
                palabra = "tres";  
                break;  
            case 4:  
                palabra = "cuatro";  
                break;  
            case 5:  
                palabra = "cinco";  
                break;               
        }  
        // Salida de datos  
        System.out.println("Número: " + numero);  
        System.out.println("Palabra: " + palabra);  
        lectura.close();  
 }   
}
