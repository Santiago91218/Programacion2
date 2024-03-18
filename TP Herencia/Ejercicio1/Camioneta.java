package Ejercicio1;
public class Camioneta extends Coche {
    private int carga;

    public Camioneta(){}

    public Camioneta(String color,int ruedas,int velocidad,double cilindrada,int carga){
        super(color,ruedas,velocidad,cilindrada);
        this.carga=carga;
    }


    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    void mostrar_info(){
        System.out.println("Clase Camioneta, Color: " + getColor() + ", Ruedas: " + getRuedas() +
                ", Velocidad: " + getVelocidad() + ", Cilindrada: " + getCilindrada() + ", Carga: " + carga);
    }
}
