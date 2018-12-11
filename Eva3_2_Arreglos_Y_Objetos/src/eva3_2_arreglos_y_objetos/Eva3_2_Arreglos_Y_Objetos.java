/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arreglos_y_objetos;

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class Eva3_2_Arreglos_Y_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] apAlumnos = new Persona[5];
        for (int i = 0; i <apAlumnos.length; i++) {
            apAlumnos[i] = new Persona("juan perez");
            
        }
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i].Imprimir();
        }
    }
    
    
}
class Persona
{
public String nombre;
public void Imprimir()
{
    System.out.println(nombre);
    
}
public Persona(String nombre)
{
this.nombre = nombre;


}
}