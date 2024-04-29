package AgregarExcepcionesTP3.EjercicioCuatro;
public class Main {
    public static void main(String[] args) {
            Student s1 = new Student("Andres Bercich", 19, 7.5);
            Student s2 = new Student("Santiago Comeglio", 19, 10.0);
            Student s3 = new Student("Pablo Lima", 22, 5.25);
            Student s4 = new Student("Ulises Guzman", 19, 8.0);
            Student s5 = new Student("Federico Cappelo", 25, 3.3);

            School sc1 = new School("UTN");

            sc1.addStudent(s1);
            sc1.addStudent(s2);
            sc1.addStudent(s3);
            sc1.addStudent(s4);
            sc1.addStudent(s5);

            // Intentar agregar un estudiante duplicado
            try {
                sc1.addStudent(s1);
            } catch (IllegalArgumentException e) {
                System.out.println("Error al agregar estudiante: " + e.getMessage());
            }

            sc1.showStudents();
            sc1.searchNameStudent("Pablo Lima");

            System.out.println("El promedio es: " + sc1.averageScore());
            System.out.println("La nota mas alta es: " + sc1.highestMark());
    }
}