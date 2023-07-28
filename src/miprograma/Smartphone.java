package miprograma;

/**
 *
 * @author Isma
 */
public class Smartphone {
    
    enum Marca {
        
        IPHONE, OPPO, SAMSUNG, XIAOMI, ZTE;
        
        //private int num;
        
        /*private Marca (int num) {
            
            this.num = num;
            
        }
        
        public int dameNum () {
            
            return num;
            
        }*/
        
    }
    
    // Propiedades
    
    private String SO;

    private String procesador;
    
    private int RAM_GB;
    
    private int almacenamiento_GB;
    
    private int bateria_mAH;
    
    private boolean cargaRapida;
    
    private double pantalla_pulgadas;
    
    private int camaraPrincipal_mpx;
    
    private int camaraFrontal_mpx;
    
    private int precioBase;
    
    private int precioTotal;
    
    // Constructor
    

    public Smartphone() {
    }

    public Smartphone (String so, String proc, int ram, int almac, int bat, boolean cargaR, double pant, int camP, int camF) {
        
        this.SO = so;
        
        this.procesador = proc;
        
        this.RAM_GB = ram;
        
        this.almacenamiento_GB = almac;
        
        this.bateria_mAH = bat;
        
        this.cargaRapida = cargaR;
        
        this.pantalla_pulgadas = pant;
        
        this.camaraPrincipal_mpx = camP;
        
        this.camaraFrontal_mpx = camF;
        
    }
    
    /*public Marca getMarca () {
        
        return Marca.valueOf();
        
    }
    
    public void setMarca (Marca marca) {
        
        this.Marca = marca;
        
    }*/
    
    /*public void setSO (int i) {
        
        if () {
            
            SO = "iOS";
            
            
            
        } else if () {
            
            
            
        }
        
    }*/
    
    public void setTipoCarga (boolean cargaRapida) {
        
        if (cargaRapida == true) {
            
            precioBase = precioBase + 60;
            
        }
        
    }
    
    //public void 
    
}
