package Ejercicio1;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Coche coche1=new Coche("Verde",4,120,1.0);
        vehiculos.add(coche1);

        Bicicleta bici1=new Bicicleta("Rojo",2,"Deportiva");
        vehiculos.add(bici1);

        Motocicleta moto1=new Motocicleta("Violeta",2,"Urbana",200,3.6);
        vehiculos.add(moto1);

        Camioneta camioneta1=new Camioneta("Blanco",4,180,3.7,60);
        vehiculos.add(camioneta1);

        catalogar(vehiculos,0);
        catalogar(vehiculos,2);
        catalogar(vehiculos,4);
    }
    public static void catalogar(Vehiculo [] vehiculos){
        for(Vehiculo v:vehiculos){
            v.mostrar_info();
        }
    }
    public static void catalogar(ArrayList<Vehiculo> vehiculos,int ruedas){
        int cont_vehiculos=0;
        for(Vehiculo v:vehiculos){
            if(v.getRuedas()==ruedas){
                cont_vehiculos+=1;
                v.mostrar_info();
            }
        }
        System.out.println("Se han encontrado "+cont_vehiculos+" vehiculos"+" con "+ruedas+" ruedas");
        System.out.println("--------------------");
    }
}