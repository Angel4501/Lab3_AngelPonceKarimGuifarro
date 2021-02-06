package lab3_angelponce;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_AngelPonceKarimGuifarro {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Corporaciones> corp = new ArrayList();
        //ArrayList<Corporaciones> corporaciones = new ArrayList();
        ArrayList<Marcas> marcas = new ArrayList();
        ArrayList<Modelos> modelos = new ArrayList();
        int opcion=0;
        while(opcion!=5){
            System.out.println("|MENÚ|");
            System.out.println("1.Corporaciones ");
            System.out.println("2.Marcas ");
            System.out.println("3.Modelos ");
            
            
            System.out.print("Opción: ");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("CORPORACIONES");
                    switch(CRUD()){
                        case 1:{
                            System.out.println("Agregando corporacion...");
                            System.out.print("Ingrese nombre: ");
                            String nombre=sc.next();
                            System.out.print("Ingrese sede: ");
                            String sede=sc.next();
                            System.out.print("Ingrese anio de funcacion: ");
                            int yearfoundation=sc.nextInt();
                            System.out.print("Nombre de CEO o presidente: ");
                            String presidente=sc.next();
                            System.out.print("Numero total de empleados: ");
                            int empleados=sc.nextInt();
                            System.out.println("Cantidad de autos que se pueden fabricar: ");
                            int cantAutos=sc.nextInt();
                            corp.add(new Corporaciones(nombre,sede,yearfoundation,presidente,empleados,cantAutos));
                            System.out.println("Listo, para poder agregar marca vaya a la opcion 2: Marcas");
                            break;
                        }    
                        case 2:
                            System.out.println("Listando corporaciones...");
                            for (Object t : corp) {
                                System.out.println(corp.indexOf(t)+":\n"+t);
                            }
                            break;
                        case 3:{
                            System.out.println("Modificando corporaciones...");
                            System.out.println("Ingrese posicion de la corporacion a modificar: ");
                            int pos=sc.nextInt();
                            
                            System.out.print("Ingrese nombre: ");
                            String nombre=sc.next();
                            corp.get(pos).setNombre(nombre);
                            System.out.print("Ingrese sede: ");
                            String sede=sc.next();
                            corp.get(pos).setSede(sede);
                            System.out.print("Ingrese anio de funcacion: ");
                            int yearfoundation=sc.nextInt();
                            corp.get(pos).setYearfoundation(yearfoundation);
                            System.out.print("Nombre de CEO o presidente: ");
                            String presidente=sc.next();
                            corp.get(pos).setPresidente(presidente);
                            System.out.print("Numero total de empleados: ");
                            int empleados=sc.nextInt();
                            corp.get(pos).setNumEmpleados(empleados);
                            System.out.println("Cantidad de autos que se pueden fabricar: ");
                            int cantAutos=sc.nextInt();
                            corp.get(pos).setCantAutos(cantAutos);
                            System.out.println("Se modificó!");
                            break;
                        }    
                        case 4:
                            System.out.println("Eliminando coporaciones...");
                            System.out.print("Ingrese posicion de corporacion a eliminar: ");
                            int pos=sc.nextInt();
                            corp.remove(pos);
                            System.out.println("Se ha eliminado la corporacion satisfactoriamente");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("2. MARCAS");
                    switch(CRUD()){
                        case 1:
                            if(corp.isEmpty()){
                                System.out.println("NO hay corporaciones creadas");
                            }
                            else{
                                System.out.println("Agregando marcas...");
                                for(int i=0; i<corp.size(); i++){
                                    System.out.println("Posicion "+i+": "+corp.get(i).getNombre());
                                }
                                System.out.println("Ingrese la posicion de la corporacion: ");
                                int p=sc.nextInt();
                                
                                System.out.println(corp.get(p).getNombre());
                                String nombre, slogan, fundador, presidente;
                                int yearfundacion, yearIntegro, numModelos; //número de modelos: size del arraylist Modelos;
                                double totalVentas;
                                System.out.println("Ingrese nombre de la marca: ");
                                nombre=sc.next();
                                System.out.println("Ingrese slogan: ");
                                slogan=sc.next();
                                System.out.println("Fundador: ");
                                fundador=sc.next();
                                System.out.println("Nombre del presidente de marca: ");
                                presidente=sc.next();
                                System.out.println("Anio de fundacion de la marca: ");
                                yearfundacion=sc.nextInt();
                                System.out.println("Anio de integracion: ");
                                yearIntegro=sc.nextInt();
                                System.out.println("Total de ventas: ");
                                totalVentas=sc.nextDouble();
                                marcas.add(new Marcas(nombre,slogan,fundador,presidente,yearfundacion,yearIntegro,totalVentas));
                                corp.get(p).setMarcas(marcas);
                                System.out.println("Se agregó la marca");
                            }
                            break;
                        case 2:
                            System.out.println("Listando marcas...");
                            for(int i=0; i<marcas.size(); i++){
                                System.out.println(marcas.get(i));
                            }
                            break;
                        case 3:
                            System.out.println("Modificando marcas...");
                            System.out.println("Ingrese posicion de la marca a modificar: ");
                            int pos=sc.nextInt();
                            String nombre, slogan, fundador, presidente;
                            int yearfundacion, yearIntegro, numModelos; //número de modelos: size del arraylist Modelos;
                            double totalVentas;
                            System.out.println("Ingrese nombre de la marca: ");
                            nombre=sc.next();
                            marcas.get(pos).setNombre(nombre);
                            
                            System.out.println("Ingrese slogan: ");
                            slogan=sc.next();
                            marcas.get(pos).setSlogan(slogan);
                            System.out.println("Fundador: ");
                            fundador=sc.next();
                            marcas.get(pos).setFundador(fundador);
                            System.out.println("Nombre del presidente de marca: ");
                            presidente=sc.next();
                            marcas.get(pos).setPresidente(presidente);
                            System.out.println("Anio de fundacion de la marca: ");
                            yearfundacion=sc.nextInt();
                            marcas.get(pos).setYearfundacion(yearfundacion);
                            System.out.println("Anio de integracion: ");
                            yearIntegro=sc.nextInt();
                            marcas.get(pos).setYearIntegro(yearIntegro);
                            System.out.println("Total de ventas: ");
                            totalVentas=sc.nextDouble();
                            marcas.get(pos).setTotalVentas(totalVentas);
                            System.out.println("Se modificó la marca!");
                            break;
                        case 4:
                            System.out.println("Elimando marcas...");
                            System.out.println("Ingrese posicion de la marca: ");
                            int pos1=sc.nextInt();
                            marcas.remove(pos1);
                            break;
                    }
                    break;
                case 3:{
                    System.out.println("3. MODELOS");
                    switch(CRUD()){
                        case 1:
                            if(marcas.isEmpty()){
                                System.out.println("No se pueden agregar modelos, no hay marcas creadas");
                            }
                            else{
                                System.out.println("Agregando modelos...");
                                System.out.println("Corporaciones disponibles: ");
                                for(int i=0; i<corp.size(); i++){
                                    System.out.println("Posicion "+i+": "+corp.get(i).getNombre());
                                }
                                System.out.println("Ingrese la posicion de la corporacion: ");
                                int p=sc.nextInt();
                                
                                System.out.println("Marcas existentes de esa Corporacion:");
                                for(int i=0; i<corp.get(p).getMarcas().size(); i++){
                                    System.out.println(i+" "+corp.get(p).getMarcas().get(i).getNombre());
                                }
                                System.out.println("Ingrese posicion de marca: ");
                                int pos=sc.nextInt();
                                
                                String nombre, anioFabricacion, tipoMotor, cilindradaMotor, precio, tecnologias; 
                                System.out.println("Ingrese nombre: ");
                                nombre=sc.next();
                                System.out.println("Anio de fabricacion: ");
                                anioFabricacion=sc.next();
                                System.out.println("Tipo de mototr: ");
                                tipoMotor=sc.next();
                                System.out.println("Cilindrada de motor: ");
                                cilindradaMotor=sc.next();
                                System.out.println("Ingrese precio: ");
                                precio=sc.next();
                                System.out.println("Tecnologias: ");
                                tecnologias=sc.next();
                                System.out.println("Carrocerias");
                                System.out.println("1. Hatchback");
                                System.out.println("2. Sedan");
                                System.out.println("3. SUV");
                                System.out.println("Eliga: ");
                                int elig=sc.nextInt();
                                if(elig==1){
                                    int capacidadMaletero, longitudTotal, bolsasDeAire;
                                    System.out.println("Capacidad de maletero: ");
                                    capacidadMaletero=sc.nextInt();
                                    System.out.println("Longitud: ");
                                    longitudTotal=sc.nextInt();
                                    System.out.println("Bolsas de aire cantidad: ");
                                    bolsasDeAire=sc.nextInt();
                                    modelos.add(new MoHatchback(capacidadMaletero,longitudTotal,bolsasDeAire,nombre,anioFabricacion,tipoMotor,cilindradaMotor,precio,tecnologias));
                                    marcas.get(pos).setModelos(modelos);
                                }
                                else if(elig==2){
                                    String AndroidPlay="no", AndroidAuto="no";
                                    //AndroidPlay es SI o NO
                                    ArrayList<String> asistentesDeConduccion = new ArrayList();
                                    System.out.println("AndroidPlay? [s/n]: ");
                                    AndroidPlay=sc.next();
                                    System.out.println("Android Auto [s\n]: ");
                                    AndroidAuto=sc.next();
                                    System.out.println("Cuantos asistentes de conduccion?: ");
                                    int asis=sc.nextInt();
                                    for(int i=0;i<asis; i++){
                                        System.out.println("Ingrese asistente de conduccion: ");
                                        String asistente=sc.next();
                                        asistentesDeConduccion.add(asistente);
                                    }
                                    modelos.add(new MoSedan(AndroidPlay,AndroidAuto,asistentesDeConduccion,nombre,anioFabricacion,tipoMotor,cilindradaMotor,precio,tecnologias));
                                    marcas.get(pos).setModelos(modelos);
                                }
                                else if(elig==3){
                                    String cuatroXcuatro="no";
                                    int cantPasajeros; 
                                    String nombreNavegador;
                                    System.out.println("4X4? [s\n]");
                                    cuatroXcuatro=sc.next();
                                    System.out.println("Cantidad de pasajeros: ");
                                    cantPasajeros=sc.nextInt();
                                    System.out.println("Nombre del navegador: ");
                                    nombreNavegador=sc.next();
                                    modelos.add(new MoSUV(cuatroXcuatro,cantPasajeros,nombreNavegador,nombre,anioFabricacion,tipoMotor,cilindradaMotor,precio,tecnologias));
                                }
                                
                            }
                            break;
                        case 2:
                            System.out.println("Listando modelos...");
                            for(int i=0; i<modelos.size(); i++){
                                System.out.println(modelos.get(i));
                            }
                            break;
                        case 3:
                            System.out.println("Modificando modelos...");
                            
                            break;
                        case 4:
                            System.out.println("Eliminando modelos...");
                            System.out.println("Elija posicion de modelo: ");
                            int pos=sc.nextInt();
                            modelos.remove(pos);
                            break;
                    }
                    
                    break;
                }
                    
                default:
                    System.out.println("\nOpción no válida, ingrésela nuevamente");
                    break;
            }
        }//Fin del while
    }//Fin del método main
    
    public static int CRUD(){
        System.out.println("1. Agregar");
        System.out.println("2. Listar");
        System.out.println("3. Modificar");
        System.out.println("4. Eliminar");
        System.out.print("Opcion: ");
        int opc=sc.nextInt();
        return opc;
    }
}//Fin de la clase
