/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int[] vector = new int[10];
        int num, cont=0;
        
        System.out.println("Ingrese un numero a buscar");
        num=leer.nextInt();
        
        for (int i = 0; i < 10; i++) {
            vector[i]=(int)(Math.random()*5+1);
            if(num == vector[i] && cont==0){
              cont++;
              System.out.println("El numero se encuentra en la pocicion: "+ (i+1));
            }else if(num == vector[i]){
                cont++;
            }
        }
        if(cont > 1){
            System.out.println("el numero se encuentra repetido");
        }
    }
    
}
