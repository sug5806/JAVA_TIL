package for_.Q_2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine().trim();

        int n = Integer.parseInt(s);

        int index = 1;

        while (index <= 9) {
            System.out.printf("%d * %d = %d\n", n, index, n * index);
            index++;
        }
    }
}
