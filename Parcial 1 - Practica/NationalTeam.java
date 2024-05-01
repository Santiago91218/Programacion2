import java.util.*;
public class NationalTeam {
    //Atributos
    private String color;
    private String country;
    private ArrayList<Athlete> belongs = new ArrayList<>();

    //Constructor
    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
    }
    public void addAthlete(Athlete a){
        //Metodo para añadir un atleta
        this.belongs.add(a);
    }
    public void showExtraWeight(){
        System.out.println("Peso extra de los atletas del Team : "+this.country);
        for (Athlete a:belongs) {
            double imc =a.calculateIMC();
            if(a.thereExtraWeight(imc)){
                System.out.println(a.getName() + " tiene peso extra");
            }else{
                System.out.println(a.getName() + " no tiene peso extra");
            }

        }

    }
    //getters y setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public ArrayList<Athlete> getBelongs() {
        return belongs;
    }
    public void setBelongs(ArrayList<Athlete> belongs) {
        this.belongs = belongs;
    }
}