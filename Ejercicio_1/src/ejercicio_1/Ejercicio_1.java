/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author Zere
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int [10];
        int i;
        
        for ( i = 0; i < 100; i++) { //  FOR para rellenar un vector
            vector[i] = i+1;
        }   
        System.out.println("Impresión de un vector con los 100 primeros números enteros de forma descendente");  
       
        for (i = 99; i >= 0; i--) { //FOR para mostrar un vector
              System.out.println("[" + vector[i] + "]");
          }  
            System.out.println("");
    }
    
}
