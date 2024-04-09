package RelacionUnidireccional;
public class Main {
    public static void main(String[] args) {
        Universidad utn=new Universidad("UTN");
        Universidad masa=new Universidad("MASA");
        Estudiante e1=new Estudiante("Santiago");

        //agrego estudiante a una universidad
        e1.setUniversidad(utn);

        //Muestro a la universidad que va
        e1.mostrarUniversidad();

        //Cambio al estudiante de universidad
        e1.cambiarUniversidad(masa);

        //Muesto  su nueva universidad
        e1.mostrarUniversidad();

    }
}