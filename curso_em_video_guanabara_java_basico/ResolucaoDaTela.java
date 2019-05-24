
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael R. Sanches
 */
public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        
        System.out.println("Resolução da Tela:");
        System.out.println(d.width + " x " + d.height);
    }
}
