package EjercicioEquipo;
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Santiago", "Delantero", 10);
        Player p2 = new Player("Miguel", "Medio Campista", 5);
        Player p3 = new Player("Josema", "Defensa", 4);
        Team t1=new Team();

        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);

        for (Player p : t1) {
            System.out.println("Jugador " + p.getName() + ", Posicion " + p.getPosition() + ", Camiseta " + p.getT_shirt_num());
        }
    }
}