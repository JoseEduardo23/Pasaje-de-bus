package EL_BUHO;

public class Pasajero extends Ticket{
    String Nombre;
    String Apellido;
    int edad;

    public Pasajero() {}

    public Pasajero(String apellido, String nombre, int edad) {
        Apellido = apellido;
        Nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void Mostrar_Datos(){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: "+Apellido);
        System.out.println("Edad: "+edad);

    }
}
