package No1;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}


class Student {
    int rollNo;
    String name;
    int age;
    String course;


    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException(
                    "Age must be between 15 and 21"
            );
        }

        if (!name.matches("[A-Za-z ]+")) {
            throw new NameNotValidException(
                    "Name should contain only alphabets"
            );
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Ramesh", 15 ,"Computer Science");
            System.out.println("Student created successfully");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

