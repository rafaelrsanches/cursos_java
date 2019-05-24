
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael R. Sanches
 */
public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        
        System.out.println("O idioma do sistema é:");
        System.out.println(idioma.getDisplayLanguage());
    }
}
