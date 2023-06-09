/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author Natali
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;  
        
        //Ejercicio 5
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa el valor de la variable booleana");
        boolean band = read.nextBoolean();
        System.out.println("Ingresa el valor de la variable doble");
        double doble = read.nextDouble();
        System.out.println("Ingresa el valor de la variable caracter");
        char letra = read.next().charAt(0);
        
        //Detección de errores
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();       

        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        
        
    }
    
}
