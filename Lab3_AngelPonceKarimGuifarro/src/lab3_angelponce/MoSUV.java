package lab3_angelponce;

public class MoSUV extends Modelos {
    
    String cuatroXcuatro="no";
    int cantPasajeros; 
    String nombreNavegador;

    public MoSUV(int cantPasajeros, String nombreNavegador, String nombre, String anioFabricacion, String tipoMotor, String cilindradaMotor, String precio, String tecnologias) {
        super(nombre, anioFabricacion, tipoMotor, cilindradaMotor, precio, tecnologias);
        this.cantPasajeros = cantPasajeros;
        this.nombreNavegador = nombreNavegador;
    }


    public String getCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(String cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public String getNombreNavegador() {
        return nombreNavegador;
    }

    public void setNombreNavegador(String nombreNavegador) {
        this.nombreNavegador = nombreNavegador;
    }

    @Override
    public String toString() {
        return super.toString()+"MoSUV{" + "cuatroXcuatro=" + cuatroXcuatro + ", cantPasajeros=" + cantPasajeros + ", nombreNavegador=" + nombreNavegador + '}';
    }
    
    
    
}
