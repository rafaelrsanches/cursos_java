/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Rafael R. Sanches
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,
            s = 0,
            tv = 0,
            tp = 0,
            ti = 0,
            ac = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            if(n != 0) tv++;
            if(n % 2 == 0) tp++;
            if(n % 2 != 0) ti++;
            if(n > 100) ac++;
        }while(n != 0);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" +
                                            "<br>Total de valores: " + tv +
                                            "<br>Total de pares: " + tp +
                                            "<br>Total de ímpares: " + ti +
                                            "<br>Acima de 100: " + ac +
                                            "<br>Média dos valores: " + (s/tv) +
                                            "</html>");
    }
    
}
