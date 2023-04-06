/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_3;

/**
 *
 * @author Zere
 */
public class Ejercicio_Extra_3 {

    public static void llenadoAleatorio(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random()*10+1);
        }
    }
    
    public static void mostrarVector(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print("["+v[i]+"]");
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[10];
        
        llenadoAleatorio(vector);
        mostrarVector(vector);
    }
    
}
