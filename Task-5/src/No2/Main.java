package No2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        strings.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);
    }
}
