package Ejercicio;
public class Operario extends Empleado{
    private String apellido;
    private int dni;
    public Operario(){}

    public Operario(String nombre,String apellido,int dni){
        super(nombre);
        this.apellido=apellido;
        this.dni=dni;
    }

   public void acivarDesactivarEmpleado(boolean e){
        if(e){
            System.out.println("Operario activo");
        }else{
            System.out.println("Operario descativo");
        }
   }

    @Override
    public String toString(){
        return "Operario: "+ "Nombre "+getNombre() + "\n Apellido "+this.apellido+"\n DNI: "+this.dni;
    };


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
