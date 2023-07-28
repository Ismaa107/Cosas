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
        
        Marca m;
        
        m = Marca.ZTE;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1.- Iphone. \n 2.- Oppo. \n 3.- Samsung. \n 4.- Xiaomi. \n 5.- ZTE.");
        
        int numMarca = entrada.nextInt();
        
        /*switch (m) {
            
            case IPHONE:
                
                Marca.IPHONE;
                
                break;
                
            case OPPO:
                
                Marca.OPPO;
                
                break;
                
            case SAMSUNG:
                
                Marca.SAMSUNG;
                
                break;
                
            case XIAOMI:
                
                Marca.XIAOMI;
                
                break;
                
            case ZTE:
                
                Marca.ZTE;
                
                break;
            
        }*/
        
    }
    
}
