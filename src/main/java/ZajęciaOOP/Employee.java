package ZajęciaOOP;

public class Employee extends Person {
    public Employee(String name, String surname, int age, int sallary) {
        super(name, surname, age, sallary);
    }
    @Override
    public void describe();
    }
}
