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
public class HolaMundoNombre2 {
    public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);
 // Mensaje para el usuario
 System.out.println("Ingrese nombre edad altura: ");
 // leemos el nombre
 String nom = scanner.next();

 // leemos la edad
 int edad= scanner.nextInt();

 // leemos la altura
 double altura = scanner.nextDouble();
 // mostramos los datos por consola
 System.out.println("Nombre: "+nom
 +" Edad: "+edad
 +" Altura : "+altura);
 }
}
