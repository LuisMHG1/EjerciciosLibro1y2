/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01.cadenas;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Cadenas8 {
    public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Ingrese una cadena: ");
 String s1 = scanner.next();
 System.out.println("Ingrese otra cadena: ");
 String s2 = scanner.next();
 // muestro las cadenas para verificar lo que contienen
 System.out.println("s1 = [" + s1 + "]");
 System.out.println("s2 = [" + s2 + "]");
 // ahora si
 if( s1.equals(s2) )
 {
 System.out.println("Son iguales");
 }
 else
 {    
     System.out.println("Son distintos");
 }
 }
}
