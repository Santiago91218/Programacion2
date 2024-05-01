import java.util.*;
public class Proof {
    //Atributos
    private int code;
    private String tittle;
    private ArrayList<Athlete> participans = new ArrayList<>();

    //Constructor
    public Proof(int code, String tittle) {
        this.code = code;
        this.tittle = tittle;
    }
    public void addParticipants(Athlete a){
        this.participans.add(a);
    }

    //getters y setters
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public ArrayList<Athlete> getParticipans() {
        return participans;
    }
    public void setParticipans(ArrayList<Athlete> participans) {
        this.participans = participans;
    }
}