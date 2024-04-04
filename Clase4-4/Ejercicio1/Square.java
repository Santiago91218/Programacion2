package Ejercicio1;
public class Square implements Figure, Drawable, Rotatable {
    private float lado;

    public Square(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public String drawable() {
        return "Dibujando cuadrado";
    }

    @Override
    public String rotate() {
       return "Rotando Cuadrado";
    }
}