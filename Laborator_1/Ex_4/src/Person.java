public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter pentru nume
    public String getName() {
        return name;
    }

    // Setter pentru nume
    public void setName(String name) {
        this.name = name;
    }

    // Getter pentru vârstă
    public int getAge() {
        return age;
    }

    // Setter pentru vârstă
    public void setAge(int age) {
        if (age >= 0) { // Verificați dacă vârsta este un număr pozitiv
            this.age = age;
        } else {
            System.out.println("Vârsta trebuie să fie un număr pozitiv.");
        }
    }
}
