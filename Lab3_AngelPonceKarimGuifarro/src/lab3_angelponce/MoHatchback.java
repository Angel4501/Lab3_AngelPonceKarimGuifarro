package lab3_angelponce;

public class MoHatchback extends Modelos{
    
    int capacidadMaletero, longitudTotal, bolsasDeAire;

    public MoHatchback(int capacidadMaletero, int longitudTotal, int bolsasDeAire, String nombre, String anioFabricacion, String tipoMotor, String cilindradaMotor, String precio, String tecnologias) {
        super(nombre, anioFabricacion, tipoMotor, cilindradaMotor, precio, tecnologias);
        this.capacidadMaletero = capacidadMaletero;
        this.longitudTotal = longitudTotal;
        this.bolsasDeAire = bolsasDeAire;
    }

    

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getLongitudTotal() {
        return longitudTotal;
    }

    public void setLongitudTotal(int longitudTotal) {
        this.longitudTotal = longitudTotal;
    }

    public int getBolsasDeAire() {
        return bolsasDeAire;
    }

    public void setBolsasDeAire(int bolsasDeAire) {
        this.bolsasDeAire = bolsasDeAire;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMoHatchback{" + "capacidadMaletero=" + capacidadMaletero + ", longitudTotal=" + longitudTotal + ", bolsasDeAire=" + bolsasDeAire + '}';
    }
    
    
    
}
