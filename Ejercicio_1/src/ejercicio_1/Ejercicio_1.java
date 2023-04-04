/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
   y le pida al usuario un número a buscar en el vector. El programa mostrará 
   dónde se encuentra el numero y si se encuentra repetido
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
 