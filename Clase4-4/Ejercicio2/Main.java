package Ejercicio2;
public class Main {
    public static void main(String[] args) {
        Magician mago1=new Magician(5,100,"Mago");
        Rogue picaro1=new Rogue(4,95,"Picaro");
        Warrior guerrero1=new Warrior(6,90,"Guerrero");


        System.out.println("INICIO DEL JUEGO");
        System.out.println(mago1.getName() +" Vs "+picaro1.getName()+ " Vs "+guerrero1.getName());
        System.out.println("---------------------------------");

        while(true){

            System.out.println(guerrero1.getName()+ " ataca a "+picaro1.getName() +" y "+ mago1.getName());
            int warrior_damage = guerrero1.attack();
            picaro1.defend(warrior_damage);
            mago1.defend(warrior_damage);

            System.out.println(mago1.getName()+ " ataca a "+picaro1.getName() +" y "+ guerrero1.getName());
            int magician_damage = mago1.attack();
            picaro1.defend(magician_damage);
            guerrero1.defend(magician_damage);

            System.out.println(picaro1.getName()+ " ataca a "+guerrero1.getName() +" y "+ mago1.getName());
            int rogue_damage = picaro1.attack();
            guerrero1.defend(rogue_damage);
            mago1.defend(rogue_damage);


            if (guerrero1.getLife_points() <= 0 || mago1.getLife_points() <= 0 || picaro1.getLife_points() <= 0) {
                System.out.println("FIN DEL JUEGO");
                break;
            }

        }

        System.out.println("PUNTOS DE VIDA");
        System.out.println( guerrero1.getName()+": "+guerrero1.getLife_points());
        System.out.println( mago1.getName()+": "+mago1.getLife_points());
        System.out.println( picaro1.getName()+": "+picaro1.getLife_points());


        if(guerrero1.getLife_points()==0){
            System.out.println(guerrero1.getName()+ " ha perdido");
        }else if(mago1.getLife_points()==0){
            System.out.println(mago1.getName()+ " ha perdido");
        } else if (picaro1.getLife_points()==0) {
            System.out.println(picaro1.getName()+ " ha perdido");
        }
    }
}