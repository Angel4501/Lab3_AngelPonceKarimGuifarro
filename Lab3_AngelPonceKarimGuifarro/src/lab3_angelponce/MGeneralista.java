package lab3_angelponce;

public class MGeneralista extends Marcas{
    String tipo; //tipo Lowcost o semipremium

    public MGeneralista(String tipo, String nombre, String slogan, String fundador, String presidente, 
            int yearfundacion, int yearIntegro, int numModelos, double totalVentas) {
        super(nombre, slogan, fundador, presidente, yearfundacion, yearIntegro, numModelos, totalVentas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "MGeneralista{" + "tipo=" + tipo + '}';
    }
    
    
    
    
}
