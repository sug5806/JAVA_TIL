package strings.Q_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        String s = br.readLine();

        String[] split = s.split("");

        int sum = 0;

        for (String s1 : split) {
            sum += Integer.parseInt(s1);
        }

        System.out.println(sum);
    }
}
