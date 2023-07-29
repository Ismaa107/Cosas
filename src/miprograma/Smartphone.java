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
    Marca marca;

    private String so;

    private String procesador;
    
    private int ram;
    
    private int almacenamiento;
    
    private int bateria;
    
    private boolean cargaRapida;
    
    private double pantalla;
    
    private int camaraPrincipal;
    
    private int camaraFrontal;
    
    private int precioBase;
    
    private int precioTotal;
    
    // Constructor
    public Smartphone () {

    }

    public Smartphone (String so, String proc, int ram, int almac, int bat, boolean cargaR, double pantalla, int camP, int camF) {
        
        this.so = so;
        
        this.procesador = proc;
        
        this.ram = ram;
        
        this.almacenamiento = almac;
        
        this.bateria = bat;
        
        this.cargaRapida = cargaR;
        
        this.pantalla = pantalla;
        
        this.camaraPrincipal = camP;
        
        this.camaraFrontal = camF;
        
    }

    public Marca getMarca () {
        return marca;
    }

    public void setMarca (Marca marca) {
        this.marca = marca;
    }

    public String getSo () {
        return so;
    }

    public void setSo (String so) {
        this.so = so;
    }

    public String getProcesador () {
        return procesador;
    }

    public void setProcesador (String procesador) {
        this.procesador = procesador;
    }

    public int getRam () {
        return ram;
    }

    public void setRam (int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento () {
        return almacenamiento;
    }

    public void setAlmacenamiento (int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getBateria () {
        return bateria;
    }

    public void setBateria (int bateria) {
        this.bateria = bateria;
    }

    public boolean isCargaRapida () {
        return cargaRapida;
    }

    public void setCargaRapida (boolean cargaRapida) {
        this.cargaRapida = cargaRapida;
    }

    public double getPantalla () {
        return pantalla;
    }

    public void setPantalla (double pantalla) {
        this.pantalla = pantalla;
    }

    public int getCamaraPrincipal () {
        return camaraPrincipal;
    }

    public void setCamaraPrincipal (int camaraPrincipal) {
        this.camaraPrincipal = camaraPrincipal;
    }

    public int getCamaraFrontal () {
        return camaraFrontal;
    }

    public void setCamaraFrontal (int camaraFrontal) {
        this.camaraFrontal = camaraFrontal;
    }

    public int getPrecioBase () {
        return precioBase;
    }

    public void setPrecioBase (int precioBase) {
        this.precioBase = precioBase;
    }

    public int getPrecioTotal () {
        return precioTotal;
    }

    public void setPrecioTotal (int precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public void setSoMarca (Marca m) {
        
        if (m.equals(Marca.IPHONE)) {
            
            so = "iOS";
            
        }/* else if (m.equals(Marca.OPPO || Marca.SAMSUNG || Marca.XIAOMI || Marca.ZTE)) { // Me da error aquí con los or, me lo puedes fixear si es un fallo pequeño.
            
            so = "Android";
            
        }*/
        
    }

    public String resumenSmartphone () {

        return "Las características de su smartphone serán: ";

    }
    
    /*public void setTipoCarga (boolean cargaRapida) {
        
        if (cargaRapida) {
            
            precioBase = precioBase + 60;
            
        }
        
    }*/
    
}
