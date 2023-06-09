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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la nota (Entre 0 y 10)");
        nota = leer.nextInt();
        while(nota<0 || nota>10)
        {
            System.out.println("La nota digitada no es correcta, vuelva a intentarlo");
            nota = leer.nextInt();
        }
        System.out.println("Felicitaciones, la nota es:" +  nota);
    }
    
}
