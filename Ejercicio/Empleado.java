package Ejercicio;
public abstract class Empleado {
    private String nombre;

    public Empleado(){}

    public Empleado(String nombre){
        this.nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return "El nombre del empleado es: "+nombre;
    }

}