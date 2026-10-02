public class Asiento {
    private String codigo;
    private boolean ocupado;
    
    public Asiento(String codigo) {
        this.ocupado = false;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public void ocupar() {
      if (ocupado){
        System.out.println("El asiento " + codigo + " ya está ocupado.");
        } else {
            ocupado = true;
            System.out.println("El asiento " + codigo + " ha sido ocupado.");
      }
    }
    public void desocupar() {
      if (!ocupado){
        System.out.println("El asiento " + codigo + " ya está desocupado.");
        } else {
            ocupado = false;
            System.out.println("El asiento " + codigo + " ha sido desocupado.");
      }
    }
    public void mostrarEstado() {
        String estado = ocupado ? "ocupado" : "desocupado";
        System.out.println("El asiento " + codigo + " está " + estado + ".");
    }
}
