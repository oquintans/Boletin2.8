/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float grados,f,k;
        
        System.out.println("Grados Centígrados:");
        Scanner dato=new Scanner(System.in);
        grados=dato.nextFloat();
        f=grados*9/5+32;
        k=grados+273;
        System.out.println("Grados Fahrenheit:"+f);
        System.out.println("Grados Kelvin:"+k);
        
    }
    
}
