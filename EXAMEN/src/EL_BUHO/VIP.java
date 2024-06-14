package EL_BUHO;

public class VIP extends Ruta{
    public VIP() {}

    public VIP(String tipo, Double precio) {

    }
    public double Precio(){
        double adicional = Precio*0.30;
        double Precio_final = Precio + adicional;
        return Precio;
    }
    @Override
    public void Mostrar_Datos(){
        super.Mostrar_Datos();
        System.out.println("Origen: " + getOrigen());
        System.out.println("Destino: " + getDestino());
        System.out.println("Precio: " + Precio());
    }
}
