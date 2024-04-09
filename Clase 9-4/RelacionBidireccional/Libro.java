package RelacionBidireccional;
import java.util.ArrayList;
public class Libro {
    private String titulo;
    private ArrayList<Persona> personas=new ArrayList<>();
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void listPosesion(){
        System.out.println("Personas que poseen el libro: "+this.titulo);
        for (Persona p:personas) {
            System.out.println(p.getNombre());
        }
    }

    public void addPersona(Persona p){
        personas.add(p);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}