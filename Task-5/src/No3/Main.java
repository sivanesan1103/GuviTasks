package No3;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> students = Arrays.asList(
                "Arun", "Bala", "Anita", "David", "Ajay",
                "Kiran", "Asha", "Rahul", "Akash", "Meena"
        );

        students.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
