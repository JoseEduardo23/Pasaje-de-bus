package EL_BUHO;

public class Ticket {
    String Codigo;
    String Tipo;

    public Ticket() {}

    public Ticket(String codigo, String tipo) {
        Codigo = codigo;
        Tipo = tipo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public void Mostrar_Datos(){
        System.out.println("Codigo: "+Codigo);
        System.out.println("Tipo: "+Tipo);
    }
}
