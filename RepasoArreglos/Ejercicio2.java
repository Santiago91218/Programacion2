package RepasoArreglos;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big_cousin = 0, position = 0;

        int[] numbers = new int[10];
        System.out.println("Ingrese 10 numeros ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (isCousin(numbers[i]) && numbers[i] > big_cousin) {
                big_cousin = numbers[i];
                position = i;
            }
        }

        System.out.println("El numero primo mas grande es "+big_cousin+" y esta en la posicion "+position);

    }
    public static boolean isCousin(int number) {
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}