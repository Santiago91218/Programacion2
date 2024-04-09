package RelacionAgregacion;
public class Main {
    public static void main(String[] args) {
        Empresa empresa=new Empresa();

        Empleado e1=new Empleado("Santi","Gerente");
        Empleado e2=new Empleado("Raul","Administrador");
        Empleado e3=new Empleado("Andres","Limpiador");

        Departamento d1=new Departamento("Recursos Humanos");
        Departamento d2=new Departamento("Marketing");

        //Añadimos los departamentos a la empresa
        empresa.addDeparatamento(d1);
        empresa.addDeparatamento(d2);

        //Mostarmos la cantidad de departamentos de la empresa
        empresa.mostrarDepartamentos();

        //Añadimos empleados a los departamentos
        d1.addEmpleado(e1);
        d1.addEmpleado(e2);
        d2.addEmpleado(e3);

        //Mostramos empleados de los departamentos
        d1.mostrarEmpleados();
        d2.mostrarEmpleados();

    }
}