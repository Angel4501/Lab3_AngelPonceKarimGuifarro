package lab3_angelponce;

import java.util.ArrayList;

public class MoSedan extends Modelos{
    
    String AndroidPlay="no", AndroidAuto="no";
    //AndroidPlay es SI o NO
    ArrayList<String> asistentesDeConduccion = new ArrayList();

    public MoSedan() {
    }
    
    public MoSedan(String AndroidPlay, String AndroidAuto, ArrayList<String> asistentesDeConduccion) {
        this.AndroidAuto=AndroidAuto;
        this.AndroidPlay=AndroidPlay;
        this.asistentesDeConduccion=asistentesDeConduccion;
    }

    @Override
    public String toString() {
        return "MoSedan{" + "AndroidPlay=" + AndroidPlay + ", AndroidAuto=" + AndroidAuto + ", asistentesDeConduccion=" + asistentesDeConduccion + '}';
    }
    
    
    
}
