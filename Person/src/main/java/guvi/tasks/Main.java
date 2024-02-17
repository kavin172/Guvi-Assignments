package guvi.tasks;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("Kavin",24);
        person.name = "Raj";
        person.display();
        person2.display();
    }
}