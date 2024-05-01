import java.util.ArrayList;
public class Sede {
    //Atributos
    private int phase;
    private String date;
    private String hour;
    private ArrayList<Facility> where = new ArrayList<>();
    private ArrayList<Proof> is_does = new ArrayList<>();

    //Constructor
    public Sede(int phase, String date, String hour) {
        this.phase = phase;
        this.date = date;
        this.hour = hour;
    }

    public void whereDoes(Facility f,Proof p){
        f.setAssociated_test(p);//asociamos la instalacion a la prueba
        this.where.add(f);
        this.is_does.add(p);
    }

    //getters y setters
    public int getPhase() {
        return phase;
    }
    public void setPhase(int phase) {
        this.phase = phase;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHour() {
        return hour;
    }
    public void setHour(String hour) {
        this.hour = hour;
    }
    public ArrayList<Facility> getWhere() {
        return where;
    }
    public void setWhere(ArrayList<Facility> where) {
        this.where = where;
    }
    public ArrayList<Proof> getIs_does() {
        return is_does;
    }
    public void setIs_does(ArrayList<Proof> is_does) {
        this.is_does = is_does;
    }
}