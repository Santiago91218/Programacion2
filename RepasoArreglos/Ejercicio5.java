package RepasoArreglos;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int num_big=0,count=0;

        System.out.println("Ingrese 10 numeros ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if(numbers[i]>num_big){
                num_big=numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==num_big){
                count++;
            }
        }
        System.out.println("El numero mas grande es "+num_big+" y se repite "+count+" veces");

    }
}