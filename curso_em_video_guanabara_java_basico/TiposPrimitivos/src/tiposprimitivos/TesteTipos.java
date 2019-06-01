/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author Rafael R. Sanches
 */
public class TesteTipos {
    public static void main(String[] args) {
        /*int idade = 30;
         *String valor = Integer.toString(idade);
         * 
         *System.out.println(valor);
         */
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        
        System.out.printf("%.2f\n", idade);
    }
}
