import java.util.*;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //Ejercicio 1
        /*while (true) {
            System.out.println("Que operacion desea realizar? \n" +
                    "1-Suma \n" +
                    "2-Resta \n" +
                    "3-Multp \n" +
                    "4-Division \n" +
                    "5-Salir");
            String op = sc.nextLine();
            if (op.equals("1")) {
                System.out.println("Suma");
                suma(sc);
            } else if (op.equals("2")) {
                System.out.println("Resta");
                resta(sc);
            } else if (op.equals("3")) {
                System.out.println("Multiplicacion");
                multp(sc);
            } else if (op.equals("4")) {
                System.out.println("Division");
                div(sc);
            } else if (op.equals("5")) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion incorrecta");
            }
        }*/

        //Ejercicio 2
        /*System.out.println("Que conversion desea realizar? \n" +
                        "1-Celsius a Fahrenheit \n" +
                        "2-Fahrenheit a Celsius \n");
        String op=sc.nextLine();

        if(op.equals("1")){
            System.out.println("1-Celsius a Fahrenheit");
            System.out.println("Ingrese los grados Celsius: ");
            double c=sc.nextDouble();
            double fah=(c*9/5)+32;
            System.out.println("Los grados celsius a Fahrenheit son: "+fah);

        }else if(op.equals("2")){
            System.out.println("Fahrenheit a Celsius");
            System.out.println("Ingrese los grados Fahrenheit");
            double f=sc.nextDouble();
            double celsius=(f-32)*5/9;
            System.out.println("Los grados Fahrenheit a celsius son: "+celsius);
        }*/

        //Ejercicio 3
        /*System.out.println("Ingrese un numero: ");
        int num1=sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2=sc.nextInt();

        System.out.println("Los numeros aleatorios entre el "+num1 +" y el "+ num2+" son:");
        for(int i =0;i<10;i++){
            int randomNum = random.nextInt((num2 - num1) + 1) + num1;
            System.out.println(randomNum);
        }*/

        //Ejercicio 4
        /*System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        if (numero <= 1) {
            System.out.println("El numero: " + numero + " no es primo.");
        } else {

            int raiz = (int) Math.sqrt(numero);
            int contador = 0;

            for (int i = raiz; i > 1; i--) {
                if (numero % i == 0) {
                    contador++;
                }
            }
            if (contador < 1) {
                System.out.println("El numero: " + numero + " es primo.");
            } else {
                System.out.println("El numero: " + numero + " no es primo.");
            }
        }*/

        //Ejercicio 5
        /*int numMax, numMin;
        System.out.println("Ingrese el numero mínimo: ");
        numMin = sc.nextInt();
        numMax = numMin;
        while (numMax <= numMin) {
            System.out.println("Ingrese el numero Maximo (Este debe ser distinto y mayor al número mínimo): ");
            numMax = sc.nextInt();
        }
        while (numMin <= numMax) {

            if (!NumeroPrimo(numMin)){
                System.out.println("El número "+ numMin+ " es primo");
            }
            numMin+=1;

        }*/

        //Ejercicio 6
        /*String frase;
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        System.out.println(VocalesConsonantes(frase));*/

        //Ejercicio 7
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando:"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando:"));
        String signo = JOptionPane.showInputDialog("Introduce el signo aritmetico (+, -, *, /, ^, %):");


        double resultado = 0;
        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = (double) operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Signo aritmetico no valido.");
                return;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
        //Ejercicio 8
        /*int mayor=0,suma=0,sumapositivos=0,sumanegativos=0,cont_nums=0;
        double media = 0;
        int menor=Integer.MAX_VALUE;
        while(true){
            System.out.println("Ingrese numeros enteros(ingrese -1 para terminar)");
            int num=sc.nextInt();
            if(num==-1){
                System.out.println("El numero mas grande es: "+mayor);
                System.out.println("El numero mas chico es: "+menor);
                System.out.println("La suma de todos los numeros es: "+suma);
                System.out.println("Suma de positivos: "+sumapositivos);
                System.out.println("Suma negativos: "+sumanegativos);
                System.out.println("La media de los numeros es: "+ media);
                break;
            }
            cont_nums+=1;
            suma+=num;

            media=(double)suma/cont_nums;
            if(num>mayor){
                mayor=num;
            }
            if(num<menor){
                menor=num;
            }
            if(num>0){
                sumapositivos+=num;
            }else{
                sumanegativos+=num;
            }
        }*/

        //Ejercicio 9
        /*int n,m;
        System.out.println("Ingrese el numero de filas: ");
        n=sc.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        m=sc.nextInt();

        int  [][]matriz1 =new int [n][m];
        int  [][]matriz2 =new int [n][m];
        int [][]suma_matrices=new int  [n][m];

        System.out.println("Matriz 1");
        for (int i=0; i < n; i++) {
            for(int j=0;j<m;j++){
                System.out.println("Ingrese un numero entero");
                matriz1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matriz 2");
            for (int i=0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println("Ingrese un numero entero");
                    matriz2[i][j] = sc.nextInt();
                }
            }


        for (int i=0; i < n; i++) {
            for(int j=0;j<m;j++){
                suma_matrices[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }

        System.out.println("Resultado de la suma de matrices");
        for (int i=0; i < n; i++) {
            for(int j=0;j<m;j++){
                System.out.print(suma_matrices[i][j]+ " ");
            }
            System.out.println();
        }*/

        //Ejercicio 10
        /*int sum_notas = 0;

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre=sc.nextLine();

        System.out.println("Cuantas notas desea ingresar? ");
        int num_notas=sc.nextInt();

        System.out.println("Ingrese las notas del alumno "+nombre);
        for(int i=0;i<num_notas;i++){
            int nota = sc.nextInt();
            sum_notas+=nota;
        }

        double promedio= (double) sum_notas/num_notas;
        System.out.println("El promedio del alumno "+nombre+" es: "+promedio);*/
    public static String suma(Scanner s) {

        System.out.println("Ingrese el primer numero: ");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = s.nextInt();

        return "El rsultado de la suma es: " + (num1 + num2);
    }
    public static String resta(Scanner s) {

        System.out.println("Ingrese el primer numero: ");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = s.nextInt();

        return "El resultado de la resta es: " + (num1 - num2);
    }
    public static String multp(Scanner s) {

        System.out.println("Ingrese el primer numero: ");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = s.nextInt();

        return "El resultado de la multp es: " + (num1 * num2);
    }
    public static String div(Scanner s) {

        System.out.println("Ingrese el primer numero: ");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = s.nextInt();


        if (num2 == 0) {
            return "No se puede dividir por cero";
        } else {
            double resultado = (double) num1 / num2;
            return "El resultado es: " + resultado;
        }
    }
    public static boolean NumeroPrimo(int num) {
        int dividendos = 0;
        int divisor = 1;
        if (num < 0) {
            while (divisor >= num) {
                if (num % divisor == 0 && num != 1 && num != 0 && num != -1) {
                    dividendos += 1;
                }
                divisor -= 1;
            }
        } else {
            while (divisor <= num) {

                if (num % divisor == 0 && num != 1 && num != 0 && num != -1) {

                    dividendos += 1;

                }
                divisor += 1;
            }
        }
        return dividendos > 2;

    }
    public static String VocalesConsonantes (String f){
        int vocales, consonantes;
        vocales = 0;consonantes = 0;
        f = f.toLowerCase();
        char [] arrayF = f.toCharArray();
        for (char a : arrayF){
            if (a == 'a' || a == 'e' || a == 'i'|| a == 'o' || a == 'u'){

                vocales+=1;

            }else if (a != ' '){
                consonantes+=1;
            }
        }
        return "La frase ingresada tiene "+ vocales + " vocales, y tiene "+ consonantes + " consonantes";
    }
}