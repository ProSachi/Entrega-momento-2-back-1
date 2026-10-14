public class Articulo extends Documento {
    
    private String tipoAlmacenamiento;

    public Articulo(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public Articulo(String nombre, String autor, String tipoPasta, String numeroHojas, boolean esIlustrado,
            String tipoAlmacenamiento) {
        super(nombre, autor, tipoPasta, numeroHojas, esIlustrado);
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    @Override
    public void prestar() {
        System.out.println("El articulo esta siendo prestado");
    }

}
