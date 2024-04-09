package RelacionBidireccional;
import java.util.ArrayList;
public class Persona {
    private String nombre;
    private ArrayList<Libro> libros=new ArrayList<>();
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void listLibros(){
        System.out.println("Lista de libros de la persona "+this.nombre);
        for (Libro l:libros) {
            System.out.println(l.getTitulo());
        }
    }

    public void addLibro(Libro l){
        this.libros.add(l);
        l.addPersona(this);//agregamos la Persona al libro
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}