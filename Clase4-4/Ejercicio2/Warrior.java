package Ejercicio2;
public class Warrior extends BaseCharacter {
    private int force;

    public Warrior(int level, int life_points, String name) {
        super(level, life_points, name);
        this.force = 5;
    }

    @Override
    public int attack() {
        return 25+force;
    }

    @Override
    public int defend(int damage) {
        int defend=15;
        int tot_damage=damage-defend;
        if (tot_damage > 0) {
            int currentLife = getLife_points() - tot_damage;
            setLife_points(currentLife);
            if (getLife_points() < 0) {
                setLife_points(0);
            }
        }
        return tot_damage ;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}