package miprograma;

import java.util.Scanner;
import miprograma.Smartphone.Marca;

/**
 *
 * @author Isma
 */
public class MiPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Conseguir marca.
        Marca m = Marca.ZTE;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Selecciona la marca del smartphone: \n 1.- Iphone. \n 2.- Oppo. \n 3.- Samsung. \n 4.- Xiaomi. \n 5.- ZTE.");
        
        int numMarca = entrada.nextInt();
        
        switch (numMarca) {
            
            case 1:
                
                m = Marca.IPHONE;
                
                break;
                
            case 2:

                m = Marca.OPPO;
                
                break;
                
            case 3:

                m = Marca.SAMSUNG;
                
                break;
                
            case 4:

                m = Marca.XIAOMI;
                
                break;
                
            case 5:

                m = Marca.ZTE;
                
                break;
            
        }

        System.out.println("Marca elegida: " + m);

        //
        
    }
    
}
