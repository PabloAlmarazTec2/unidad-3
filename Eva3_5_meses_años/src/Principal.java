
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
            String[] asMes = {"Enero","Febrero","Marzo","Abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Scanner input = new Scanner(System.in);
         int iMes = input.nextInt();
         System.out.println(iMes-1);
         System.out.println(asMes[iMes]);
    }
    
}
