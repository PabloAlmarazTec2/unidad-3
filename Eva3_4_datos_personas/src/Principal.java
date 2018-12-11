
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in);
         int[] aiEdades = new int[10];
         String[] asNombres = new String[10];
        int iAcum=0;
         for (int i = 0; i <aiEdades.length; i++) {
            asNombres[i] = leer.nextLine();
            aiEdades[i] = leer.nextInt();
                   leer.nextLine();
        iAcum = iAcum + aiEdades[i];
         }
         
         for (int i = 0; i < 10; i++) {
             System.out.println("nombre "+asNombres[i]+"edad"+aiEdades[i]);
        }
            System.out.println("la media es: "+(double)(iAcum/10));
    }
}
      //Persona[] apAlumnos = new Persona[10];
   
     /* for (int i = 0; i < aiEdades.length; i++) {
            int iEdad = (int)(Math.random()*40) +1;
            aiEdades[i] = iEdad;}
       for (int i = 0; i < aiEdades.length; i++) {
            System.out.println(aiEdades[i]);
        }
      
       for (int i = 0; i <apAlumnos.length; i++) {
           String nombre = leer.nextLine();
            apAlumnos[i] = new Persona(nombre);
            
        }
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i].Imprimir();
            
        }
         int iAcum = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            
            iAcum = iAcum + aiEdades[i];
        }
        System.out.println("la media es: "+(double)(iAcum/10));
        System.out.println(iEdad);
    }
    }
      
    
    class Persona
{
  
public String nombre;
public int edad;
public void Imprimir()
{
    
    System.out.println(nombre+edad);
    
}
public Persona(String nombre)
{
this.nombre = nombre;


}
    }
*/

