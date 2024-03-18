package Ejercicio2;
public class Oso extends Animal{
    private String tipo,garras,pelaje;
    private int peso;

    public Oso(String nombre,String genero,int edad,String tipo,String garras,String pelaje,int peso){
        super(nombre,genero,edad);
        this.tipo=tipo;
        this.garras=garras;
        this.pelaje=pelaje;
        this.peso=peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }

    public String getGarras() {
        return garras;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }



    @Override
    void hacer_sonido(){
        System.out.println("El oso hace grrrr");
    }

    @Override
    void informacion(){
        System.out.println("Animal: Oso \n"+
                    "Nombre: "+getNombre()+"\n"+
                    "Genero: "+getGenero()+"\n"+
                    "Edad: "+getEdad()+"\n"+
                    "Tipo: "+tipo+"\n"+
                    "Garras: "+garras+"\n"+
                    "Pelaje: "+pelaje+"\n"+
                    "Peso: "+peso+"kg");
    }
}
