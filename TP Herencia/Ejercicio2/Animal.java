package Ejercicio2;
public abstract class Animal {
    private String nombre,genero;
    private int edad;

    public Animal(String nombre,String genero,int edad){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    abstract void hacer_sonido();

    abstract void informacion();
}
