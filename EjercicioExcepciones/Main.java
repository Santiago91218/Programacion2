package EjercicioExcepciones;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = 0, number2 = 0;
        String option;
        while (true) {
            try {
                System.out.println("Ingrese un numero");
                number1 = sc.nextInt();
                System.out.println("Ingrese otro numero");
                number2 = sc.nextInt();
                sc.nextLine();

                System.out.println("Eliga una operacion 1)Suma 2)Resta 3)Multiplicacion 4)Division ");
                option = sc.nextLine();

                if (option.equals("5")) {
                    System.out.println("Saliendo...");
                    break;
                }
                switch (option) {
                    case "1":
                        System.out.println("La suma es: " + (number1 + number2));
                        break;
                    case "2":
                        System.out.println("La resta es: " + (number1 - number2));
                        break;
                    case "3":
                        System.out.println("La multiplicacion es: " + (number1 * number2));
                        break;
                    case "4":
                        try {
                            System.out.println("La division es: " + (number1 / number2));
                            break;
                        } catch (ArithmeticException a) {
                            System.out.println("No se puede dividir por cero");
                            System.out.println(a.getMessage());
                        }
                }
                break;//Salir del bucle while
            } catch (InputMismatchException e) {
                System.out.println("No ingreso un numero");
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}