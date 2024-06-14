import EL_BUHO.Ticket;
import EL_BUHO.Ruta;
import EL_BUHO.VIP;
import EL_BUHO.Servicio;
import EL_BUHO.Pasajero;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos Ruta, VIP, Servicio y Pasajero
        Ruta nuevaRuta = new Ruta("Quito", "Guayaquil", 20.0);
        VIP nuevoVIP = new VIP("VIP", 37.50);
        Servicio servicioVIP = new Servicio(false, false, false, false, 1);
        Pasajero pasajero1 = new Pasajero("Perez", "Anaguano", 22);

        // Creación de objeto Ticket
        Ticket ticket1 = new Ticket("175065AA","VIP");

        // Impresión de los datos del ticket

        ticket1.Mostrar_Datos();
        nuevaRuta.Mostrar_Datos();
        nuevoVIP.Mostrar_Datos();
        servicioVIP.Mostrar_Datos();
        pasajero1.Mostrar_Datos();
    }
    //Lincango Flores Jose Eduardo EXAMEN B1
}