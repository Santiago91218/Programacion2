package RepasoArreglos;
import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        int num_big=0,count=0;

        System.out.println("Ingrese 10 numeros ");
        for (int i = 0; i < 10; i++) {
            int number=sc.nextInt();
            numbers.add(number);
            if(number>num_big){
                num_big=number;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)==num_big){
                count++;
            }
        }
        System.out.println("El numero mas grande es "+num_big+" y se repite "+count+" veces");
    }
}