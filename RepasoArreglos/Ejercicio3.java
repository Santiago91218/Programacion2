package RepasoArreglos;
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;

        for (int i = 100; i <= 300; i++) {
            if (isCousin(i)) {
                numbers[count] = i;
                count++;
                if (count == 10) {
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