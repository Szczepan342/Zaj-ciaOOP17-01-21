package ZajęciaOOP;

public class javadev extends Employee {
    private String[] knowTechnologies;

    public javadev(String name, String surname, int age, int sallary, String[] knowTechnologies) {
        super(name, surname, age, sallary);
        this.knowTechnologies = knowTechnologies;
    }

    public void setKnowTechnologies(String[] knowTechnologies) {
        this.knowTechnologies = knowTechnologies;
    }

    public String[] getKnowTechnologies() {
        return knowTechnologies;
    }
}
