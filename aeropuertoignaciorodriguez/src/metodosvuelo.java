import java.util.ArrayList;


public class metodosvuelo {
    private static ArrayList<vuelo> listavuelos = new ArrayList<vuelo>();

    public static void addNewVuelo(vuelo vuelo) {
        if (findVuelo(vuelo)<0){
            System.out.println("\n Se ha añadido el vuelo");
            listavuelos.add(vuelo);
            System.out.println();
        }else{
            System.out.println("El vuelo ya existe, no se ha podido añadir a la lista");
            System.out.println();
        }
    }
    public static void mostrarvuelos() {
        if (listavuelos.size()==0){
            System.out.println("La lista de vuelos esta vacia");
            System.out.println();
        }else {
            for (vuelo listavuelo : listavuelos) {
                System.out.println("\n " +"numero:" + listavuelo.getNumero() + "," + "origen:"+listavuelo.getOrigen() + "," +"destino:"+ listavuelo.getDestino() + ", dia: " + listavuelo.getDia() + ", clase: " + listavuelo.getClase());
            }
        }
    }
    public static int findVuelo(vuelo vuelo) {
        int index = listavuelos.indexOf(vuelo);
        if (index >= 0) {
            return listavuelos.indexOf(vuelo);
        } else {
            return -1;
        }
    }
    public static void findvueloNumero(String numerovuelo){
        for (vuelo listavuelo : listavuelos) {
            if (listavuelo.getNumero().matches(numerovuelo)) {
                System.out.println("numero:" + listavuelo.getNumero() + "," + "origen:"+listavuelo.getOrigen() + "," +"destino:"+ listavuelo.getDestino() + ", dia: " + listavuelo.getDia() + ", clase: " + listavuelo.getClase());
                return;
            }else {

                return;
            }
        }
    }

    public static vuelo  buscarvuelo(String numerovuelo){
        for (vuelo listavuelo : listavuelos) {
            if (listavuelo.getNumero().matches(numerovuelo)) {

                return listavuelo;
            }
        }
        System.out.println("No se encuentran vuelos con ese numero introducido");
        return null;
    }
    public static boolean removevuelo(String numero){
        System.out.println("El vuelo numero " + numero + " se elimino");
        System.out.println();
        listavuelos.remove(buscarvuelo(numero));
        return true;

    }
    public static void printVuelos(){
        if (listavuelos.size()==0){
            System.out.println("La lista de vuelos esta vacia");
            System.out.println();
        }else {
            for (vuelo listavuelo : listavuelos) {
                System.out.println("\n " +"numero:" + listavuelo.getNumero() + "," + "origen:"+listavuelo.getOrigen() + "," +"destino:"+ listavuelo.getDestino() + ", dia: " + listavuelo.getDia() + ", clase: " + listavuelo.getClase());
            }
        }
    }
    public static void findvueloClase(String clase){
        boolean entrar =true;
        for (vuelo listavuelo : listavuelos) {
            if (listavuelo.getClase().equalsIgnoreCase(clase)) {
                System.out.println("\n " +"numero:" + listavuelo.getNumero() + "," + "origen:"+listavuelo.getOrigen() + "," +"destino:"+ listavuelo.getDestino() + ", dia: " + listavuelo.getDia() + ", clase: " + listavuelo.getClase());
                entrar = false;
            }
        }
        if(entrar==true) {
            System.out.println("No se encuentran vuelos con esa clase introducida");
        }
    }
    public static void findvueloOrigen(String clase){
        boolean entrar =true;
        for (vuelo listavuelo : listavuelos) {
            if (listavuelo.getOrigen().equalsIgnoreCase(clase)) {
                System.out.println("\n " +"numero:" + listavuelo.getNumero() + "," + "origen:"+listavuelo.getOrigen() + "," +"destino:"+ listavuelo.getDestino() + ", dia: " + listavuelo.getDia() + ", clase: " + listavuelo.getClase());
                entrar = false;
            }
        }
        if(entrar==true) {
            System.out.println("No se encuentran vuelos con ese origen introducido");
        }
    }
    public static void findvueloDia(String clase){
        boolean entrar =true;
        for (vuelo listavuelo : listavuelos) {
            if (listavuelo.getDia().equalsIgnoreCase(clase)) {
                System.out.println("\n " +"numero:" + listavuelo.getNumero() + "," + "origen:"+listavuelo.getOrigen() + "," +"destino:"+ listavuelo.getDestino() + ", dia: " + listavuelo.getDia() + ", clase: " + listavuelo.getClase());
                entrar = false;
            }
        }
        if(entrar==true) {
            System.out.println("No se encuentran vuelos con ese dia introducido");
        }
    }
    public static void findvueloDestino(String clase){
        boolean entrar =true;
        for (vuelo listavuelo : listavuelos) {
            if (listavuelo.getDestino().equalsIgnoreCase(clase)) {
                System.out.println("\n " +"numero:" + listavuelo.getNumero() + "," + "origen:"+listavuelo.getOrigen() + "," +"destino:"+ listavuelo.getDestino() + ", dia: " + listavuelo.getDia() + ", clase: " + listavuelo.getClase());
                entrar = false;
            }
        }
        if(entrar==true) {
            System.out.println("No se encuentran vuelos con ese destinp introducido");
        }
    }



}