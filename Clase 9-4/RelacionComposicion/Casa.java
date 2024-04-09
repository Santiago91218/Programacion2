package RelacionComposicion;
import java.util.ArrayList;
public class Casa {
    private ArrayList<Puertas> puertas;

    public Casa() {
        puertas=new ArrayList<>();
    }

    public void addPuerta(String material){
        this.puertas.add(new Puertas(material));
    }

    public void materialPuertas(){
        System.out.println("Lo materiales de las puertas son:");
        for (Puertas p:puertas){
            System.out.println(p.getMaterial());
        }
    }
}