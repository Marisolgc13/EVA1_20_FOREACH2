/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_foreach2;

import java.util.Arrays;

/**
 *
 * @author Marisol G
 */
public class EVA1_20_FOREACH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = new int [10];
         for (int i = 0; i <arreglo.length; i++) {
             arreglo[i] = (int)(Math.random() * 100);
        }
         orderedPair(arreglo);
    }
    
    public static void orderedPair(int [] arrayOfItems){
        for (int firstItem : arrayOfItems) {
            for (int secondItem : arrayOfItems) {
                int [] arreglo = new int [] {firstItem,secondItem};
                System.out.println(Arrays.toString(arreglo));
                        
                
            }
            
        }
    }
}
