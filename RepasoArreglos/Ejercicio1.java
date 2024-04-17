package RepasoArreglos;
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_big = 0, position = 0;
        List<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Ingrese 10 numeros ");
        for (int i = 0; i < 10; i++) {
            int number=sc.nextInt();
            numbers.add(number);
            if (number > number_big) {
                number_big = number;
                position = i;
            }
        }
        System.out.println("El numero mas grande es: " + number_big + " y esta en la posicion " + position);
    }
}