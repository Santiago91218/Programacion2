package Ejercicio1;
public class Motocicleta extends Bicicleta{
    private int velocidad;
    private double cilindrada;

    public Motocicleta(){}
    public Motocicleta(String color,int ruedas,String tipo,int velocidad,double cilindrada){
        super(color,ruedas,tipo);
        this.velocidad=velocidad;
        this.cilindrada=cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public double getCilindrada() {
        return cilindrada;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    void mostrar_info(){
        System.out.println("Clase Motocicleta, Color: " + getColor() + ", Ruedas: " + getRuedas() +
                ", Tipo: " + getTipo() + ", Velocidad: " + velocidad + ", Cilindrada: " + cilindrada);
    }
}
