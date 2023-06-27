import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void menu(){
        System.out.println("""
          
                =======================================
                    VUELOS DEL AEROPUERTO DE VALENCIA
                =======================================
                1 - Imprimir todos los vuelos
                2 - BUscar un numero de vuelo
                3 - Buscar vuelo por clave
                4 - Añadir vuelo nuevo
                5 - Borrar vuelo por numero
                0 - Salir
                -----------------------------------------
                Dame la opción:\s""");

        String opcion = sc.nextLine();
        opcion = opcion.trim();
        while (!opcion.matches("1|2|3|4|5|0")){
            System.out.println("Por favor escriba un numero del 1 al 5 y 0 si desea salir");

            menu();

            opcion = sc.next();
        }
        switch (opcion) {
            case "1" -> {
                metodosvuelo.printVuelos();
                menu();
            }
            case "2" -> {
                buscarvuelo();
                menu();
            }
            case "3" -> {
                buscarclave();
                menu();
            }
            case "4" -> {
                crearvuelo();
                menu();
            }
            case "5" -> {
                borrarvuelo();
                menu();
            }
            case "0" -> salir();
        }
    }
    public static void buscarvuelo(){
        System.out.println("buscar vuelo por numero: ");
        System.out.print("numero de vuelo: ");
        String numerovuelo =sc.next();

        System.out.print("datos del vuelo: ");
        metodosvuelo.findvueloNumero(numerovuelo);
    }
    public static void crearvuelo() {
        System.out.println("Agregar vuelo");

        System.out.println("numero: ");
        String numero = sc.nextLine();


        System.out.println("origen: ");
        String origen = sc.nextLine();

        System.out.println("destino: ");
        String destino = sc.nextLine();

        System.out.println("fecha: ");
        String fecha = sc.nextLine();

        System.out.println("clase: ");
        String clase = sc.nextLine();





        vuelo nuevoVuelo = new vuelo(numero, origen, destino, fecha, clase);
        metodosvuelo.addNewVuelo(nuevoVuelo);
        System.out.println("Vuelo agregado con éxito.");
    }


    public static void borrarvuelo(){
        System.out.println("borrar vuelo:");

        System.out.print("numero de vuelo:");
        String numero = sc.next();
        metodosvuelo.removevuelo(numero);
    }
    public static void buscarclave(){
        System.out.println("Buscar vuelos por clave");
        System.out.print("clave: ");
        String clave = sc.next();

        while (!clave.matches("numero|origen|destino|dia|clase")){
            System.out.println("lo siento pero esa clava no existe ");
            clave=sc.next();
        }

        switch (clave){
            case "numero":
                System.out.print("valor: ");
                String numero= sc.next();
                metodosvuelo.findvueloNumero(numero);

                menu();
            case "clase":
                System.out.print("valor: ");
                String clase= sc.next();
                metodosvuelo.findvueloClase(clase);
                menu();
            case "origen":
                System.out.print("valor: ");
                String origen= sc.next();
                metodosvuelo.findvueloOrigen(origen);
                menu();
            case "dia":
                System.out.print("valor: ");
                String dia= sc.next();
                metodosvuelo.findvueloDia(dia);
                menu();
            case "destino":
                System.out.print("valor: ");
                String destino= sc.next();
                metodosvuelo.findvueloDestino(destino);
                menu();
        }
    }


    public static  void salir(){
        System.out.println("Gracias por utilizar nuestros servicios");
    }










    public static void main(String[] args) {
        vuelo va_me = new vuelo("2020-01", "Valencia", "Menorca", "15-08", "turista");
        metodosvuelo.addNewVuelo(va_me);

        vuelo va_te = new vuelo("2020-02", "Valencia", "Tenerife", "20-08", "turista");
        metodosvuelo.addNewVuelo(va_te);

        vuelo pa_va = new vuelo("2020-03", "Paris", "Valencia", "15-08", "primera");
        metodosvuelo.addNewVuelo(pa_va);

        vuelo at_va = new vuelo("2020-04", "Atenas", "Valencia", "20-08", "primera");
        metodosvuelo.addNewVuelo(at_va);
        menu();




    }
}
