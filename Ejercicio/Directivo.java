package Ejercicio;
public class Directivo extends Empleado {
    private int edad;
    public Directivo(){}

    public Directivo(String nombre,int edad) {
        super(nombre);
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Directivo: "+ "Nombre "+getNombre() + "\n Edad: "+this.edad;
    }


   public String consultaJubilacion(){
        return "Los directivos se jubilan a los 65 años, a usted le falta/n "+(65-this.edad)+" año/s";
   }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
