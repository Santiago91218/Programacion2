package Ejercicio2;
public class Magician extends BaseCharacter{
    private int especial_ability;

    public Magician(int level, int life_points, String name) {
        super(level, life_points, name);
        this.especial_ability =10;
    }



    @Override
    public int attack() {
        return 15+especial_ability;
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

    public int getEspecial_ability() {
        return especial_ability;
    }

    public void setEspecial_ability(int especial_ability) {
        this.especial_ability = especial_ability;
    }
}