/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Rafael R. Sanches
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String tipo;
        
        System.out.print("Quantas pernas? ");
        int perna = input.nextInt();
        
         System.out.println("Isso é um(a): ");
         switch(perna){
             case 1:
                 tipo = "Saci";
                 break;
             case 2:
                 tipo = "Bípede";
                 break;
             case 3:
                 tipo = "Tripé";
                 break;
             case 4:
                 tipo = "Quadrúpede";
                 break;
             case 6:
                 tipo = "Aranha";
                 break;
             default:
                 tipo = "E.T.";
         }
         
         System.out.println(tipo);
    }
    
}
