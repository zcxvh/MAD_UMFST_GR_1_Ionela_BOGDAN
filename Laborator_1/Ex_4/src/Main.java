// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Numele: " + person.getName());
        System.out.println("Varsta: " + person.getAge());

        // Setăm o nouă vârstă
        person.setAge(35);
        System.out.println("Varsta actualizata: " + person.getAge());
    }
}