
package lab3_angelponce;

import java.util.ArrayList;

public class Corporaciones {
    String nombre, sede, presidente;  
    int yearfoundation, numEmpleados, cantAutos;  
    ArrayList corp = new ArrayList();
    ArrayList<Marcas> marcas = new ArrayList();

    public Corporaciones(String nombre, String sede, int yearfoundation, 
        String presidente, int numEmpleados, int cantAutos) {
        this.nombre = nombre;
        this.sede = sede;
        this.yearfoundation = yearfoundation;
        this.presidente = presidente;
        this.numEmpleados = numEmpleados;
        this.cantAutos = cantAutos;
    }
    
    public Corporaciones(ArrayList corp, ArrayList<Marcas> marcas){
        this.corp=corp;
        this.marcas=marcas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getYearfoundation() {
        return yearfoundation;
    }

    public void setYearfoundation(int yearfoundation) {
        this.yearfoundation = yearfoundation;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public int getCantAutos() {
        return cantAutos;
    }

    public void setCantAutos(int cantAutos) {
        this.cantAutos = cantAutos;
    }

    public ArrayList getCorp() {
        return corp;
    }

    public void setCorp(ArrayList corp) {
        this.corp = corp;
    }

    public ArrayList<Marcas> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<Marcas> marcas) {
        this.marcas = marcas;
    }

    @Override
    public String toString() {
        return "Corporaciones{" + "nombre=" + nombre + ", sede=" + sede 
                + ", presidente=" + presidente + ", yearfoundation=" + yearfoundation 
                + ", numEmpleados=" + numEmpleados + ", cantAutos=" + cantAutos 
                + ", corp=" + corp + ", marcas=" + marcas + '}';
    }
    
    
    
    
}
