package RelacionAgregacion;
import java.util.ArrayList;
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados=new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarEmpleados(){
        System.out.println("Empleados del departamento "+this.nombre);
        for (Empleado e:empleados) {
            System.out.println("Nombre: "+e.getNombre()+" Cargo "+e.getCargo());
        }
    }

    public void addEmpleado(Empleado e){
        this.empleados.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}