package array.Q_3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();

        String str;

        while ((str = bufferedReader.readLine()) != null) {
            int value = Integer.parseInt(str);

            map.put(value % 42, value % 42);
        }

        int size = map.keySet().size();

        bufferedReader.close();

        System.out.println(size);

    }
}
