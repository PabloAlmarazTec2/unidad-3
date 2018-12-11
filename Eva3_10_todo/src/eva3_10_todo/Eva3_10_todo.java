/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_todo;

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class Eva3_10_todo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArreglo[] = new int[5];
        aiArreglo[0] = 0;
        aiArreglo[1] = 0;
        aiArreglo[2] = 0;
        aiArreglo[3] = 0;
        aiArreglo[4] = 0;
        for (int i = 0; i < aiArreglo.length; i++) {
         System.out.println("["+ aiArreglo[i]+"]"); 
        }
       
    }
    public static void llenarMatriz(int aiArre[])
           
    {
        for (int i = 0; i <aiArre.length; i++) {
            aiArre[i]= (int)(Math.random()*100)+1;
        }
    
    }
}
