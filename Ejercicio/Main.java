package Ejercicio;
public class Main {
    public static void main(String[] args) {

        Directivo d1=new Directivo("Jose",48);
        Operario op1=new Operario("Santiago","Comeglio",242314);
        Oficial of1=new Oficial("Pepe","Suarez",21321,2000);
        Tecnico tec1=new Tecnico("Alberto","Gonzales",24123423,60);


        System.out.println(d1.toString());
        System.out.println(d1.consultaJubilacion());
        System.out.println("-----------------------");

        System.out.println(op1.toString());
        op1.acivarDesactivarEmpleado(true);
        System.out.println("-----------------------");

        of1.aumentoSueldo(500);
        System.out.println(of1.toString());
        of1.acivarDesactivarEmpleado(true);
        System.out.println("-----------------------");

        tec1.horasExtra(5);
        System.out.println(tec1.toString());
        tec1.acivarDesactivarEmpleado(false);

    }
}
