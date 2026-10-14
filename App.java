
public class App {

    public static void main(String[] args) {

        /*   Documento objeto = new Documento("Heits","Ariada Godoy", "normal", "445", false);
        objeto.prestar(); */
        Documento libro = new Libro("Heits", "Ariada Godoy", "normal", "445", false, "59");

        libro.prestar();
        libro.leer("Heits");
        libro.entregar();

        Documento revista = new Revista("Cosmos", "Carl Sagan", "Digital", "0", true);

        revista.prestar();
        revista.leer("Cosmos");
        revista.entregar();

        Documento articulo = new Articulo("El problema de los tres cuerpos", "Chino", "Normal", "1570", false, "Digital");

        articulo.prestar();
        articulo.leer("El problema de los tres cuerpos");
        articulo.entregar();

    }
}
