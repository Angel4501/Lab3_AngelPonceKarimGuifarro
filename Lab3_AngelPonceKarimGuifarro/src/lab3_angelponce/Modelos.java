package lab3_angelponce;

public class Modelos {
    
    String nombre, anioFabricacion, tipoMotor, cilindradaMotor, precio, tecnologias; 

    public Modelos(String nombre, String anioFabricacion, String tipoMotor, String cilindradaMotor, String precio, String tecnologias) {
        this.nombre = nombre;
        this.anioFabricacion = anioFabricacion;
        this.tipoMotor = tipoMotor;
        this.cilindradaMotor = cilindradaMotor;
        this.precio = precio;
        this.tecnologias = tecnologias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getCilindradaMotor() {
        return cilindradaMotor;
    }

    public void setCilindradaMotor(String cilindradaMotor) {
        this.cilindradaMotor = cilindradaMotor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {
        return "Modelos{" + "nombre=" + nombre 
                + ", anioFabricacion=" + anioFabricacion 
                + ", tipoMotor=" + tipoMotor 
                + ", cilindradaMotor=" + cilindradaMotor 
                + ", precio=" + precio 
                + ", tecnologias=" + tecnologias + '}';
    }
    
    
    
}
