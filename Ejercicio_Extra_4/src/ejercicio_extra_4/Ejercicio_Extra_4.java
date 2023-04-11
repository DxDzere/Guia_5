/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_4;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_Extra_4 {

    public static void cargaDeNotas(double[][] m){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno "+(i+1)+": ");
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese la "+(j+1)+ " nota: ");
                m[j][i] = leer.nextDouble();
                System.out.println("");
            }
        }
    }
    
    public static void calculoProm(double[][] m){
        double aux;
        
        for (int i = 0; i < 10; i++) {
            aux=0;
            for (int j = 0; j < 5; j++) {
                switch(j){
                    case 0:
                        aux+=(m[j][i]*0.1);
                        break;
                    case 1:
                        aux+=(m[j][i]*0.15);
                        break;
                    case 2:
                        aux+=(m[j][i]*0.25);
                        break;
                    case 3:
                        aux+=(m[j][i]*0.5);
                        break;
                    case 4:
                        m[j][i]=aux;
                        break;
                }
            }
        }
    }
    
    public static void mostrarMatriz(double[][] m){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public static void ApYDes(double[][] m){
        int cantAp=0,cantDes=0;
        for (int i = 0; i < 10; i++) {
            if(m[4][i]>=70.0){
                cantAp++;
            }else{
                cantDes++;
            }
        }
        
        System.out.println("Hay "+cantAp+" estudiantes aprobados");
        System.out.println("Hay "+cantDes+" estudiantes desaprobados");
    }
    
    public static void main(String[] args) {
        double[][]matriz=new double[5][10];
        cargaDeNotas(matriz);
        calculoProm(matriz);
        mostrarMatriz(matriz);
        ApYDes(matriz);
    }
    
}
