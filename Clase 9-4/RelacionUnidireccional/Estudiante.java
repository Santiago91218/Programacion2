package RelacionUnidireccional;
public class Estudiante {
    private String nombre;
    private Universidad universidad;
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarUniversidad(){
        System.out.println("El estudiante "+this.nombre+" asiste a la universidad: "+this.universidad.getNombre());

    }

    public void cambiarUniversidad(Universidad u){
        System.out.println("El estudiante ha sido cambiado de universidad");
        setUniversidad(u);
    }
}