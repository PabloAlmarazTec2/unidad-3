/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_arrays;

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class Eva3_3_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] aiEnteros, x, y, z;//todos son arreglos
        int aiEnteros2[], a, b, c;//solo aiEnteros2 es arreglo
        //arreglo para 10 enteros
        aiEnteros = new int[10];
        System.out.println(aiEnteros); //direccion de memoria
         for (int i = 0; i < aiEnteros.length; i++) {
            aiEnteros[i] = (int)(Math.random()*100);
             System.out.println(i);
        }
        for (int i : aiEnteros) {
            System.out.println("for each"+ i);
        }
    }
    
}
