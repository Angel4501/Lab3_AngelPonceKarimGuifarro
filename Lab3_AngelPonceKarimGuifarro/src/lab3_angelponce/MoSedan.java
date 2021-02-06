package lab3_angelponce;

import java.util.ArrayList;

public class MoSedan extends Modelos{
    
    String AndroidPlay="no", AndroidAuto="no";
    //AndroidPlay es SI o NO
    ArrayList<String> asistentesDeConduccion = new ArrayList();


    public MoSedan(String nombre, String anioFabricacion, String tipoMotor, String cilindradaMotor, String precio, String tecnologias) {
        super(nombre, anioFabricacion, tipoMotor, cilindradaMotor, precio, tecnologias);
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"MoSedan{" + "AndroidPlay=" + AndroidPlay + ", AndroidAuto=" + AndroidAuto + ", asistentesDeConduccion=" + asistentesDeConduccion + '}';
    }
    
    
    
}
