public class Facility {
    //Atributos
    private String category;
    private String name;
    private String type;
    private String location;
    private Proof associated_test;

    //Constructor
    public Facility(String category, String name, String type, String location) {
        this.category = category;
        this.name = name;
        this.type = type;
        this.location = location;
    }
    //getters y setters
    public Proof getAssociated_test() {
        return associated_test;
    }
    public void setAssociated_test(Proof associated_test) {
        this.associated_test = associated_test;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}