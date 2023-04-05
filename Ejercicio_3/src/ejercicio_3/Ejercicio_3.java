/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author Zere
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        for (int i = 0; i < 10; i++) {
            vector[i]=(int)(Math.random()*99999+1);
        }
        
        for(int elemento: vector){
            if(elemento <= 99999 && elemento >= 10000){
                cont5++;
            }else if(elemento <= 9999 && elemento >= 1000){
                cont4++;
            }else if(elemento <= 999 && elemento >= 100){
                cont3++;
            }else if(elemento <= 99 && elemento >= 10){
                cont2++;
            }else{
                cont1++;
            }
        }
        
        System.out.println("Hay "+cont1+" numeros con 1 digito.");
        System.out.println("Hay "+cont2+" numeros con 2 digito.");
        System.out.println("Hay "+cont3+" numeros con 3 digito.");
        System.out.println("Hay "+cont4+" numeros con 4 digito.");
        System.out.println("Hay "+cont5+" numeros con 5 digito.");
    }
    
}
