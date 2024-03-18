package Ejercicio2;
public class Gato extends Animal {
    private String raza,color,color_ojos,cola;
    private int peso;

    public Gato(String nombre,String genero,int edad,String raza,String color,String color_ojos,String cola,int peso){
        super(nombre,genero,edad);
        this.raza=raza;
        this.color=color;
        this.color_ojos=color_ojos;
        this.cola=cola;
        this.peso=peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getCola() {
        return cola;
    }

    public void setColor_ojos(String color_ojos) {
        this.color_ojos = color_ojos;
    }

    public String getColor_ojos() {
        return color_ojos;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    void hacer_sonido(){
        System.out.println("El gato hace miaauu");
    }

    @Override
    void informacion(){
        System.out.println("Animal: Gato \n"+
                "Nombre: "+getNombre()+"\n"+
                "Genero: "+getGenero()+"\n"+
                "Edad: "+getEdad()+"\n"+
                "Raza: "+raza+"\n"+
                "Color: "+color+"\n"+
                "Color de ojos: "+color_ojos+"\n"+
                "Cola: "+cola+"\n"+
                "Peso: "+peso+"kg");
    }
}
