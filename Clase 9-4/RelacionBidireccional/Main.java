package RelacionBidireccional;
public class Main {
    public static void main(String[] args) {
        Libro l1=new Libro("Mi planta Naranja Lima");
        Libro l2=new Libro("Harry Potter");
        Persona p1=new Persona("Jose");
        Persona p2=new Persona("Pepe");

        //Añaimos libros a una persona
        p1.addLibro(l1);
        p1.addLibro(l2);
        p2.addLibro(l1);

        //Mostramos lista de libros de cada persona
        p1.listLibros();
        p2.listLibros();

        //Mostramos lista de Personas que poseen un libro
        l1.listPosesion();
        l2.listPosesion();
    }
}