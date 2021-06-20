package strings.Q_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder;

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            stringBuilder = new StringBuilder();

            String[] values = br.readLine().split(" ");

            int repeatCount = Integer.parseInt(values[0]);

            String[] alphaNumeric = values[1].split("");

            for (String s : alphaNumeric) {
                stringBuilder.append(s.repeat(repeatCount));
            }

            System.out.println(stringBuilder.toString());
        }
    }
}
