package Ejercicio;
public class Tecnico extends Operario {

    private int hs_trabajadas_mes;

    public Tecnico(){}
    public Tecnico(String nombre,String apellido,int dni,int hs_trabajadas_mes){
        super(nombre,apellido,dni);
        this.hs_trabajadas_mes=hs_trabajadas_mes;
    }

    public void acivarDesactivarEmpleado(boolean e) {
        if (e) {
            System.out.println("Tecnico activo");
        } else {
            System.out.println("Tecnico descativo");
        }
    }



        public int getHs_trabajadas_mes() {
        return hs_trabajadas_mes;
    }

    public void horasExtra(int extras){
        this.hs_trabajadas_mes+=extras;
    }

    public void setHs_trabajadas_mes(int hs_trabajadas_mes) {
        this.hs_trabajadas_mes = hs_trabajadas_mes;
    }

    @Override
    public String toString(){
        return "Tecnico: "+ "Nombre "+getNombre() + "\n Apellido "+getApellido() +"\n DNI: "+getDni() +
                "\n Horas trabajadas por mes: "+this.hs_trabajadas_mes ;
    }


}
