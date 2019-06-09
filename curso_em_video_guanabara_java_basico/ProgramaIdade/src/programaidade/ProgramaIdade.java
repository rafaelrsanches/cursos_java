/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Rafael R. Sanches
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calendar = Calendar.getInstance();
        Scanner input = new Scanner(System.in);
        
        int anoAtual = calendar.get(Calendar.YEAR);
        
        System.out.print("Em que ano você nasceu? ");
        int nasc = input.nextInt();
        
        int idade = anoAtual - nasc;
        
        System.out.println("Sua idade é " + idade);
        
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
    
}
