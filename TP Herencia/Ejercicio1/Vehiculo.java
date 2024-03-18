package Ejercicio1;
public abstract class Vehiculo {
    private String color;
    private int ruedas;

    public Vehiculo(){}

    public Vehiculo(String color,int ruedas){
        this.color=color;
        this.ruedas=ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract void mostrar_info();
}
