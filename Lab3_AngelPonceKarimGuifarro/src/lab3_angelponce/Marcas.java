package lab3_angelponce;

import java.util.ArrayList;

public class Marcas {
    String nombre, slogan, fundador, presidente;
    int yearfundacion, yearIntegro, numModelos; //número de modelos: size del arraylist Modelos;
    double totalVentas;
    ArrayList<Modelos> modelos = new ArrayList();
    
    public Marcas(String nombre, String slogan, String fundador, String presidente, 
            int yearfundacion, int yearIntegro, int numModelos, double totalVentas) {
        this.nombre = nombre;
        this.slogan = slogan;
        this.fundador = fundador;
        this.presidente = presidente;
        this.yearfundacion = yearfundacion;
        this.yearIntegro = yearIntegro;
        this.numModelos = numModelos;
        this.totalVentas = totalVentas;
    }

    public Marcas(String nombre, String slogan, String fundador, String presidente, 
        int yearfundacion, int yearIntegro, double totalVentas) {
        this.nombre = nombre;
        this.slogan = slogan;
        this.fundador = fundador;
        this.presidente = presidente;
        this.yearfundacion = yearfundacion;
        this.yearIntegro = yearIntegro;
        this.totalVentas = totalVentas;
    }
    
    public void setModelos(ArrayList<Modelos> modelos ){
        this.modelos=modelos;
    }
    
    public ArrayList<Modelos> getModelos(){
        return modelos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getYearfundacion() {
        return yearfundacion;
    }

    public void setYearfundacion(int yearfundacion) {
        this.yearfundacion = yearfundacion;
    }

    public int getYearIntegro() {
        return yearIntegro;
    }

    public void setYearIntegro(int yearIntegro) {
        this.yearIntegro = yearIntegro;
    }

    public int getNumModelos() {
        return numModelos;
    }

    public void setNumModelos(int numModelos) {
        this.numModelos = numModelos;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return "Marcas\n{" + "\nnombre=" + nombre + ",\nslogan=" + slogan 
                + ",\nfundador=" + fundador + ",\npresidente=" + presidente 
                + "\nyearfundacion=" + yearfundacion + "\nyearIntegro=" + yearIntegro 
                + ",\nnumModelos=" + numModelos + ",\ntotalVentas=" + totalVentas 
                + '\n'+modelos+'}';
    }
    
    
    
    
}
