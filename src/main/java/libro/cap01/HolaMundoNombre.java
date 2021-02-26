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
public class HolaMundoNombre {
    public static void main(String[] args)
 {
 
 System.out.println("Ingrese su nombre: ");
 Scanner scanner = new Scanner(System.in);
 
 String nom = scanner.nextLine();
 
 System.out.println("Hola Mundo: " + nom);
 }
}
