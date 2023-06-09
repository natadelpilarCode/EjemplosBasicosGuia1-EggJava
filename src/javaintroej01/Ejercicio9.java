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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,suma=0;
        String sumNum="";
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Digite un número");
            num = leer.nextInt();
            if(num>0)
            {
                suma += num;
                sumNum += Integer.toString(num) + "+";
            }
        }
        while(num!=0);
        
        System.out.println("Se capturó el número 0");
        if(sumNum.length()>0)
        {
            System.out.println("La suma de los números " + sumNum.substring(0,sumNum.length()-1) + " es " + suma);
        }
    }
    
}
