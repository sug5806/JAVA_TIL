package if_.Q_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine().trim();

        int i = Integer.parseInt(s);

        if ((i % 4 == 0 && i % 100 != 0) || (i % 4 == 0 && i % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
