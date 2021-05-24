import java.util.Arrays;

public class StreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i : arr) {
            System.out.println("i = " + i);
        }

        // forEach : 배열의 인자들을 하나씩 꺼내 출력
        Arrays.stream(arr).forEach(number -> System.out.println("number = " + number));
        System.out.println();

        int sum = Arrays.stream(arr).sum();
        long count = Arrays.stream(arr).count();
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
        System.out.println();

        // 길이가 5이상인 단어만 출력
        String[] stringList = {"qwerty", "Longest", "Substring", "add", "divide", "multiple", "sub"};
        Arrays.stream(stringList).filter(s -> s.length() >= 5).forEach(System.out::println);
    }
}
