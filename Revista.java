
public class Revista extends Documento {
    

    public Revista() {
    }

    public Revista(String nombre, String autor, String tipoPasta, String numeroHojas, boolean esIlustrado) {
        super(nombre, autor, tipoPasta, numeroHojas, esIlustrado);
    }

    //metodos
    @Override
    public void prestar() {
        System.out.println("La revista esta siendo prestada");
    }

}
