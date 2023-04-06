/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_1;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[3];
        int sum=0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un valor");
            vector[i]=leer.nextInt();
            sum+=vector[i];
        }
        
        System.out.println("La suma de los elementos del vector es: "+ sum);
    }
    
}
