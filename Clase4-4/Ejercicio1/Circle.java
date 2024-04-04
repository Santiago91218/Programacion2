package Ejercicio1;
public class Circle implements Figure, Drawable {
    private float radio;

    public Circle(float radio) {
        this.radio = radio;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    @Override
    public float area() {
        return (float) (3.14*radio*radio);
    }

    @Override
    public String drawable() {
        return "Dibujando circulo";
    }
}