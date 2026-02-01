package No1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("aBc", "d", "ef");

        names
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
