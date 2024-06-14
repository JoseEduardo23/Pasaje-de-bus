package EL_BUHO;

public class Ruta extends Ticket {
    String Origen;
    String Destino;
    Double Precio;


    public Ruta(String origen, String destino, Double precio) {
        Origen = origen;
        Destino = destino;
        Precio = precio;
    }

    public Ruta() {
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    @Override
    public void Mostrar_Datos(){
        super.Mostrar_Datos();
        System.out.println("Origen: " + Origen);
        System.out.println("Destino: " + Destino);
        System.out.println("Precio: " + Precio);
    }
}
