/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_de_la_guia_1;

/**
 *
 * @author Zere
 */
public class Ejercicio_de_la_guia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10);
        }
        
        System.out.println("Matriz");
        
        for(int elem: vector){
            System.out.print(elem + " ");
        }
    }
    
}
