package Ejercicio2;
public abstract class BaseCharacter implements Character{

    private int level;
    private int life_points;
    private String name;

    public BaseCharacter(int level, int life_points, String name) {
        this.level = level;
        this.life_points = life_points;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife_points() {
        return life_points;
    }

    public void setLife_points(int life_points) {
        this.life_points = life_points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}