package No2;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter ID: " + voterId + ", Name: " + name + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(1, "Ravi", 16);
            System.out.println(v1);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
