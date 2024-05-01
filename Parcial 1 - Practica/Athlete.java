public class Athlete extends Person implements Contract{
    //Atributos
    private double height;
    private int age;
    private double weight;

    //Constructor
    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }
    @Override
    public double calculateIMC() {
        //utilizamos Math para sacar el imc del atleta
        double imc = weight / Math.pow(height, 2);
        return imc;
    }
    @Override
    public boolean thereExtraWeight(double imc) {
        if(imc >= 25.0 && imc <= 29.9){
        //si su imc se encuentra es este rango, el atleta tiene sobrepeso
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double takePulsations() {
        //Esta formula calcula las pulsaciones
        return 220- this.age;
    }

    //getters y setters
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}