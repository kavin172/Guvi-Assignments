package guvi.tasks;

public class Person {
    String name;
    int age;
    public Person(){
        this.age = 18;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("person name : "+ name);
        System.out.println("Age : "+age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
