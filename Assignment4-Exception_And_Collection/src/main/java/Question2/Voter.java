package Question2;

public class Voter {
    private int voterId;
    private String name;
    private int age;

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Voter(int voterId, String name, int age) {
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}
