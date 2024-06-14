package EL_BUHO;

public class NORMAL extends Ruta {
    public NORMAL() {}

    @Override
    public void Mostrar_Datos(){
        super.Mostrar_Datos();
        System.out.println("Origen" + getOrigen());
        System.out.println("Destino" + getDestino());
        System.out.println("Precio" + getPrecio());
    }
}
