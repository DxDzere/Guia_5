/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_de_la_guia_2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_de_la_guia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int miembros;
        String nombre;
        
        System.out.println("Ingrese los miembros");
        miembros=leer.nextInt();
        
        String[] equipo = new String[miembros];
        
        for(String elemento: equipo){
            System.out.println("Ingrese el nombre de un miembro del equipo");
            nombre = leer.next();
            
            elemento = nombre;
        }
        
        for(String elemento: equipo){
            System.out.println(elemento +" ");
        }
    }
    
}
