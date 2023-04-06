/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector1 = new int[3], vector2 = new int[3];
        boolean bool=true;
        
        
        for (int i = 0; i < 3; i++) {
            vector1[i] = (int)(Math.random()*10+1);
            vector2[i] = (int)(Math.random()*10+1);
        }
        
        for(int elemento: vector1){
            System.out.print("["+elemento+"]");
        }
        System.out.println("");
        for (int elemento: vector2) {
            System.out.print("["+elemento+"]");
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            if(vector1[i]==vector2[i]){
                bool = true;
            }else{
                bool = false;
                break;
            }
        }
        
        System.out.println("los vectores son iguales?");
        System.out.println(bool);
    }
    
}
