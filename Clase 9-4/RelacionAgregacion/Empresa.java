package RelacionAgregacion;
import java.util.ArrayList;
public class Empresa {
    private ArrayList<Departamento> departamentos=new ArrayList<>();
    public Empresa(){}

    public void mostrarDepartamentos(){
        for (Departamento d:departamentos) {
            System.out.println(d.getNombre());
        }
    }

    public void addDeparatamento(Departamento d){
        this.departamentos.add(d);
    }
}