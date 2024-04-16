package RepasoArreglos;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Ingrese 10 numeros ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numero que terminen en 4");
        for (int i = 0; i < numbers.length; i++) {
            if (lastDigit(numbers[i])) {
                System.out.println("Numero "+numbers[i]+" en la posicion "+i);
            }
        }
    }

    public static boolean lastDigit(int number) {
        int ult_digit_number = number % 10;
        return ult_digit_number == 4;
    }
}