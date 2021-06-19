package if_.Q_1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String[] values = s.split(" ");

        if (Integer.parseInt(values[0]) > Integer.parseInt(values[1])) {
            System.out.println(">");
        } else if (Integer.parseInt(values[0]) < Integer.parseInt(values[1])) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
