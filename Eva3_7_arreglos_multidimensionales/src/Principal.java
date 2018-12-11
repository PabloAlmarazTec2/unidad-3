/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiMatriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
          
            }
        }
        System.out.println(aiMatriz);//arreglo
        System.out.println(aiMatriz[0]);//arreglo
        System.out.println(aiMatriz[0][0]);//valor
        
        for (int i = 0; i <aiMatriz.length; i++) {
            for (int j = 0; j <aiMatriz[i].length; j++) {
                System.out.println(aiMatriz[i][j]);
            }
        }
        for (int[] is : aiMatriz) {
            for (int i : is) {
                System.out.println(i);
                
            }
            
        }
    }
    
}
