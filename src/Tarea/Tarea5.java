
package Tarea;
import java.util.Scanner;
public class Tarea5 {
public static void main (String [] args){
int numero;    
Scanner lectura = new Scanner (System.in);
String periodoA="";
System.out.print("Ingrese el numero  1,2,3,4,6,12: " );
numero = lectura.nextInt();
    switch (numero) {
        case 1:
           periodoA="mesual"; 
            break;
        case 2:
            periodoA="bimestarl";
            break;
        case 3:
            periodoA="trimestral";
            break;
        case 4:
            periodoA="cuatrimestral";
            break;
        case 6:
            periodoA="semestral";
            break;
        case 12:
            periodoA="anual";
            break;                   
    }
    System.out.println("numero: "+numero);
    System.out.println("periodoa: "+periodoA);
}
}

