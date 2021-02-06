package lab3_angelponce;

public class MPremium extends Marcas{
   String nombDivisionDeportiva, nombDivisionLujo, tipoCarroceria; //carroceria mas fabricada: sedán, hatchback o coupé

    public MPremium(String nombDivisionDeportiva, String nombDivisionLujo, String tipoCarroceria, String nombre, 
        String slogan, String fundador, String presidente, int yearfundacion, 
        int yearIntegro, int numModelos, double totalVentas) {
        super(nombre, slogan, fundador, presidente, yearfundacion, yearIntegro, numModelos, totalVentas);
        this.nombDivisionDeportiva = nombDivisionDeportiva;
        this.nombDivisionLujo = nombDivisionLujo;
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getNombDivisionDeportiva() {
        return nombDivisionDeportiva;
    }

    public void setNombDivisionDeportiva(String nombDivisionDeportiva) {
        this.nombDivisionDeportiva = nombDivisionDeportiva;
    }

    public String getNombDivisionLujo() {
        return nombDivisionLujo;
    }

    public void setNombDivisionLujo(String nombDivisionLujo) {
        this.nombDivisionLujo = nombDivisionLujo;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        return "MPremium{" + "nombDivisionDeportiva=" + nombDivisionDeportiva + ", nombDivisionLujo=" + nombDivisionLujo + ", tipoCarroceria=" + tipoCarroceria + '}';
    }
   
    
    
    
}
