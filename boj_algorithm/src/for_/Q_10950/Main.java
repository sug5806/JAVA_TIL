package for_.Q_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine().trim();

        int count = Integer.parseInt(s);

        for (int i = 0; i < count; i++) {
            String str = bufferedReader.readLine();
            String[] values = str.split(" ");

            System.out.println(Integer.parseInt(values[0]) + Integer.parseInt(values[1]));
        }
    }
}
