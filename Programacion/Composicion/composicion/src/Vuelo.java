public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[] asientos;

    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
    }
    public Vuelo ( String numero, String origen,String destino, int capacidadMaxima){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        asientos = new Asiento[capacidadMaxima];
         for (int i=0; i<capacidadMaxima; i++){
            String codigoAsiento = "A" + (i + 1);
            asientos[i] = new Asiento(codigoAsiento);
         }
        }
        public String getNumero() {
            return numero;
        }
        public String getOrigen() {
            return origen;
        }
        public String getDestino() {
            return destino;
        }
        public int getCapacidadMaxima() {
            return capacidadMaxima;
        }

        public String setNumero(String numero) {
            this.numero = numero;
            return numero;
        }
        public String setOrigen(String origen) {
            this.origen = origen;
            return origen;
        }
        public String setDestino(String destino) {
            this.destino = destino;
            return destino;
        }
        public int setCapacidadMaxima(int capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
            return capacidadMaxima;
        }
        public void mostrarAsientos() {
            System.out.println("Asientos del vuelo " + numero + ":");
            for (Asiento  a : asientos) {
                a.mostrarEstado();
            }
        }
     
        public void embarcar(String codigoAsiento) {
            for (Asiento a : asientos) {
                if (a.getCodigo().equals(codigoAsiento)) {
                    a.ocupar();
                    return;
                }
            }
            System.out.println("El asiento " + codigoAsiento + " no existe en el vuelo " + numero + ".");
        }
    }
    

