package Ejercicio1;
public class Main {
    public static void main(String[] args) {
        Square cuadrado1=new Square(4);
        Circle circulo1=new Circle(4);

        System.out.println("Area del cuadrado: "+cuadrado1.area());
        System.out.println(cuadrado1.rotate());
        System.out.println(cuadrado1.drawable());

        System.out.println("Area del circulo: "+circulo1.area());
        System.out.println(circulo1.drawable());
    }
}