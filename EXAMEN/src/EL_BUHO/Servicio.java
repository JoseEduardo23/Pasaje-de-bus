package EL_BUHO;

public class Servicio extends VIP {
    Boolean TV;
    Boolean Internet;
    Boolean Servicio_Ad1;
    Boolean Servicio_Ad2;
    int Maletas;

    public Servicio(Boolean TV, Boolean internet, Boolean servicio_Ad1, Boolean servicio_Ad2, int maletas) {
        this.TV = TV;
        Internet = internet;
        Servicio_Ad1 = servicio_Ad1;
        Servicio_Ad2 = servicio_Ad2;
        Maletas = maletas;
    }

    public Boolean getTV() {
        return TV;
    }

    public void setTV(Boolean TV) {
        this.TV = TV;
    }

    public Boolean getInternet() {
        return Internet;
    }

    public void setInternet(Boolean internet) {
        Internet = internet;
    }

    public Boolean getServicio_Ad1() {
        return Servicio_Ad1;
    }

    public void setServicio_Ad1(Boolean servicio_Ad1) {
        Servicio_Ad1 = servicio_Ad1;
    }

    public Boolean getServicio_Ad2() {
        return Servicio_Ad2;
    }

    public void setServicio_Ad2(Boolean servicio_Ad2) {
        Servicio_Ad2 = servicio_Ad2;
    }

    public int getMaletas() {
        return Maletas;
    }

    public void setMaletas(int maletas) {
        Maletas = maletas;
    }
    @Override
    public void Mostrar_Datos(){
        super.Mostrar_Datos();
        System.out.println("---------------Servicios VIP------------------");
        System.out.println("TV"+getTV());
        System.out.println("Internet"+getInternet());
        System.out.println("Servicio_Ad1"+getServicio_Ad1());
        System.out.println("Servicio_Ad2"+getServicio_Ad2());
        System.out.println("Maletas"+getMaletas());
        System.out.println("Precio"+getPrecio());
    }
}
