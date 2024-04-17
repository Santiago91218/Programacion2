package RepasoArreglos;
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Ingrese 10 numeros ");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Numero que terminen en 4");
        for (int i = 0; i < numbers.size(); i++) {
            if (lastDigit(numbers.get(i))) {
                System.out.println("Numero "+numbers.get(i)+" en la posicion "+i);
            }
        }
    }

    public static boolean lastDigit(int number) {
        int ult_digit_number = number % 10;
        return ult_digit_number == 4;
    }
}