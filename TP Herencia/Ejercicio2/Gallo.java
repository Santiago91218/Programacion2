package Ejercicio2;
public class Gallo extends Animal{
    private String plumaje,vision,alas;
    private int peso;
    public Gallo(String nombre,String genero,int edad,String plumaje,String vision,int peso,String alas){
        super(nombre,genero,edad);
        this.plumaje=plumaje;
        this.peso=peso;
        this.vision=vision;
        this.alas=alas;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getVision() {
        return vision;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getAlas() {
        return alas;
    }

    @Override
    void hacer_sonido(){
        System.out.println("El gallo hace cucurucuu");
    }

    @Override
    void informacion(){
        System.out.println("Animal: Gallo \n"+
                "Nombre: "+getNombre()+"\n"+
                "Genero: "+getGenero()+"\n"+
                "Edad: "+getEdad()+"\n"+
                "Plumaje: "+plumaje+"\n"+
                "Vision: "+vision+"\n"+
                "Alas: "+alas+"\n"+
                "Peso: "+peso+"kg");
    }
}

