/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numeros = "";
        Scanner leer = new Scanner(System.in);
        //Bucle para leer los números si están en el rango correcto
        for (int i = 1; i <= 4; i++) {
            int num;
            do {
                System.out.println("Digite un número:" + i + " entre 1 y 20");                
                num = leer.nextInt();   
            } while (num<1 || num>20);
            numeros += num + ",";            
        }
        //System.out.println("numeros " + numeros);
        String numBuscado= "";
        int buscarComa = 0,index = 0;
        
        for (int i = 0; i < 4; i++) {
            index = numeros.indexOf(",",buscarComa);                      
            numBuscado = numeros.substring(buscarComa,numeros.indexOf(",",buscarComa));
            System.out.print(numBuscado + " ");
            for (int j = 0; j < Integer.parseInt(numBuscado); j++) {
                System.out.print("*");
            }
            System.out.println("");
            buscarComa = index+1;             
        }
        
        
          
    }
    
}
