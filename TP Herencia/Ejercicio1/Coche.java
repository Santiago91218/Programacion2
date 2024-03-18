package Ejercicio1;
public class Coche extends Vehiculo{
    private int velocidad;
    private double cilindrada;

    public Coche(){}

    public Coche(String color,int ruedas,int velocidad,double cilindrada){
        super(color,ruedas);
        this.velocidad=velocidad;
        this.cilindrada=cilindrada;
    }



    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public double getCilindrada() {
        return cilindrada;
    }

    @Override
    void mostrar_info(){
        System.out.println("Clase Coche, Color: " + getColor() + ", Ruedas: " + getRuedas()
                + ", Velocidad: " + velocidad + ", Cilindrada: " + cilindrada);
    }
}
