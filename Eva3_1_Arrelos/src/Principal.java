/*

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
        //Arreglos secuencia contigua de variables 
        //del mismo tipo
        //Capturar muchos datos del mismo tipo
        //capturar edad, imprimir, calcular media
        //tec 2----> 3 mil estudiantes (4 bytes) = 12 mil bytes = 12kb-->
        //usaremos un arreglo
        //tipo de dato [] nombre del identificador = new tipo de datos[tamaño]
        //son de acceso aleatorio
        //acceso secuencial: 
        int[] aiEdades = new int[3000];
        //Arreglos en java, c, c++ tienen direcciones para cada posicion
        // ----> 0 es la primera ----> N -1 la ultima
        //siendo N ------> tama;o del arreglo
        System.out.println(aiEdades.length);
        System.out.println("Primer posicion = "+ aiEdades[0]);
        System.out.println("ultima posicion = "+ aiEdades[2999]);
        //llenando con edades:
        //17 - 40
        for (int i = 0; i < aiEdades.length; i++) {
            int iEdad = (int)(Math.random()*40) +1;
            aiEdades[i] = iEdad;
        }
        //imprimir todo el arreglo
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println(aiEdades[i]);
        }
        //for each
        for (int aiEdade : aiEdades) {
            System.out.println("for each = " + aiEdade);
        }
        
        //sumatoria para calcular media
        int iAcum = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            
            iAcum = iAcum + aiEdades[i];
        }
        System.out.println("la media es: "+(double)(iAcum/3000));
        
    }
   
    
}
