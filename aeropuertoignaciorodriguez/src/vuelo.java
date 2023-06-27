public class vuelo {
    private String  origen;
    private   String destino;
    private String dia;
    private   String clase;
    private String numero;

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDia() {
        return dia;
    }

    public String getClase() {
        return clase;
    }

    public String getNumero() {
        return numero;
    }

    public vuelo(String numero, String origen, String destino, String dia, String clase) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.clase = clase;
    }

    public static vuelo createVuelo(String numero, String origen, String destino, String dia, String clase) {
        return new vuelo(numero, origen, destino, dia, clase);
    }


}


