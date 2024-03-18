package Ejercicio1;
public class Bicicleta extends Vehiculo {
    private String tipo;
    public Bicicleta(){}

    public Bicicleta(String color,int ruedas,String tipo){
        super(color,ruedas);
        this.tipo=tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    @Override
    void mostrar_info(){
        System.out.println("Clase Bicicleta, Color: " + getColor() + ", Ruedas: " + getRuedas() +
                ", Tipo: " + tipo);
    }
}
