package Ejercicio2;
public class Rogue extends BaseCharacter{

    private int energy;

    public Rogue(int level, int life_points, String name) {
        super(level, life_points, name);
        this.energy = 100;
    }

    @Override
    public int attack() {
        energy-=10;
        if(energy>=50){
            return 20;
        }else{
            return 10;
        }
    }

    @Override
    public int defend(int damage) {
        int defend=20;
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

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}