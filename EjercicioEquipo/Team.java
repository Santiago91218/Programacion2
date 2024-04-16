package EjercicioEquipo;
import java.util.ArrayList;
import java.util.Iterator;
public class Team implements Iterable<Player>{
    private ArrayList<Player> team;
    public Team(){
        this.team=new ArrayList<>();;
    }
    public void addPlayer(Player player){
        this.team.add(player);
    }
    @Override
    public Iterator<Player> iterator(){
        return team.iterator();
    }
}