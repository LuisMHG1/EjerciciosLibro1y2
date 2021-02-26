/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class EsMayorQue21 {
    public static void main(String[] args)
    {
       
        System.out.println("ingrese su edad");
        Scanner lector = new Scanner(System.in);
        byte edad = lector.nextByte();
        if(edad >= 21)
            System.out.println("Usted es MAYOR de edad");
        else
            System.out.println("Usted es MENOR de edad");
    }
    
    
}
