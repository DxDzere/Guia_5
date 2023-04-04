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
        int [] vector = new int [100];
        int aux = 100;
        
        for ( int i = 0; i < 100; i++) { //  FOR para rellenar un vector
            vector[i] = aux;
            aux--;
            
            System.out.println("["+vector[i]+"]");
        }
    }
    
}
 