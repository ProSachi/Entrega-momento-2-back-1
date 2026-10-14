
public class Libro extends Documento {
    private String capitulos;
    public Libro(String capitulos) {
        this.capitulos = capitulos;
    }
    public Libro(String nombre, String autor, String tipoPasta, String numeroHojas, boolean esIlustrado, String capitulos) {
        super(nombre, autor, tipoPasta, numeroHojas, esIlustrado);
        this.capitulos = capitulos;
    }
    public String getCapitulos() {
        return capitulos;
    }
    public void setCapitulos(String capitulos) {
        this.capitulos = capitulos;
    }
// Metodos
    @Override
    public void prestar() {
        System.out.println("El libro " + getNombre() + " esta siendo prestado");
    }
    @Override 
    public void entregar() {
        System.out.println("El libro " + getNombre() + " esta siendo entregado");
    }
}
