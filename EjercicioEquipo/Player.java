package EjercicioEquipo;
public class Player {
    private String name,position;
    private int t_shirt_num;
    public Player(String name, String position, int t_shirt_num) {
        this.name = name;
        this.position = position;
        this.t_shirt_num = t_shirt_num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getT_shirt_num() {
        return t_shirt_num;
    }
    public void setT_shirt_num(int t_shirt_num) {
        this.t_shirt_num = t_shirt_num;
    }
}