package Ejercicio;
public class Oficial extends Operario {
    private double sueldo;

    public Oficial(){}
    public Oficial(String nombre, String apellido, int dni,double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo=sueldo;
    }
    public void acivarDesactivarEmpleado(boolean e) {
        if (e) {
            System.out.println("Oficial activo");
        } else {
            System.out.println("Oficial descativo");
        }
    }


        public double getSueldo() {
        return sueldo;
    }




    public void aumentoSueldo(double aumento){
        this.sueldo+=aumento;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Oficial: " + "Nombre " + getNombre() + "\n Apellido " + getApellido() + "\n DNI: " + getDni()
                +"\n Sueldo: " +this.sueldo+"$";
    }
}
