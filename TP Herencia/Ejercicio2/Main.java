package Ejercicio2;
public class Main {
    public static void main(String[] args) {
        Oso oso1=new Oso("Roque","Masculino",12,"Polar","Punteadas","Fino",85);
        Gato gato1=new Gato("Marta","Femenino",3,"Mestizo","Negro","Claros","Larga",15);
        Gallo gallo1=new Gallo("Carl","Masculino",1,"Grueso","Alta",5,"Cortas");

        oso1.informacion();
        oso1.hacer_sonido();
        System.out.println("-------------------------------------");

        gato1.informacion();
        gato1.hacer_sonido();
        System.out.println("-------------------------------------");

        gallo1.informacion();
        gallo1.hacer_sonido();

    }
}
