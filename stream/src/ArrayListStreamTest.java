import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Tomas");
        stringList.add("Edward");
        stringList.add("Jack");

        Stream<String> stream = stringList.stream();
        stream.forEach(System.out::println);

        stringList.stream().sorted().forEach(string -> System.out.print(string + "\t"));
        System.out.println();
        stringList.stream().map(String::length).forEach(len -> System.out.print(len + "\t"));
    }
}
