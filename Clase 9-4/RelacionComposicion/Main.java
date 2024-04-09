package RelacionComposicion;
public class Main {
    public static void main(String[] args) {
        Casa casa1=new Casa();

        //Añadimos puerta a la casa
        casa1.addPuerta("madera");
        casa1.addPuerta("metal");

        //Mostramos los materiales de las puertas
        casa1.materialPuertas();

    }
}