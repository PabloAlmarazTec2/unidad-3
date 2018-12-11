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
        int aiMatriz[][] = new int[5][5];
        int copiaMatriz[][]= new int [5][5];
      
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int)(Math.random()*100) +1;
            }
        }
        System.out.println("");
        imprimirMatriz(aiMatriz);
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz.length; j++) {
                System.out.print("["+ aiMatriz[i][j]+"]");   
            }
            System.out.println("");
        }

       
        for (int i = 0; i < copiaMatriz.length; i++) {
            for (int j = 0; j < copiaMatriz[i].length; j++) {
                System.out.print("["+copiaMatriz[i][j]+"]");
            
            }
            System.out.println("copia");
        }
     
        imprimirMatriz(copiaMatriz);
        
        
        
        
        System.out.println("\n copia");
         
               int llenadoMatriz[][] = new int[10][10];
        imprimirMAtriz2(llenadoMatriz);
        imprimirMatriz(llenadoMatriz);
    }
   public static void imprimirMAtriz2(int matriz[][])
   {
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*100) +1;
            }
        }
   
   }
    public static void imprimirMatriz(int matriz[][])
    {
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+ matriz[i][j]+"]");   
            }
            System.out.println("");
        }
    
    
    }

    
    
}
