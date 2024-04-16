package RepasoArreglos;
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number_big=0,position = 0;
        int [] numbers=new int[10];
    
        System.out.println("Ingrese 10 numeros ");
        for(int i=0; i< numbers.length;i++){
            numbers[i]=sc.nextInt();
            if(numbers[i]>number_big){
                number_big=numbers[i];
                position=i;
            }
        }
        System.out.println("El numero mas grande es: "+number_big+" y esta en la posicion "+position);

    }
}