package array.Q_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        bufferedReader.readLine();
        String str = bufferedReader.readLine();

        int[] nums = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        OptionalInt max = Arrays.stream(nums).max();
        OptionalInt min = Arrays.stream(nums).min();

        stringBuilder.append(min.getAsInt()).append(" ").append(max.getAsInt());

        System.out.println(stringBuilder.toString());
    }
}
