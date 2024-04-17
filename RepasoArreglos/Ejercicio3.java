package RepasoArreglos;
import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 100; i <= 300; i++) {
            if (isCousin(i)) {
                numbers.add(i);
                if (numbers.size()==10) {
                    break;
                }
            }
        }
        System.out.println("Los 10 numeros primos entre 100 y 300 son:");
        for (int n : numbers) {
            System.out.println(n);
        }
    }
    public static boolean isCousin(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}