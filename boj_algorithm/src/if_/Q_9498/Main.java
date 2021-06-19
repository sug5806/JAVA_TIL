package if_.Q_9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine().trim();

        int value = Integer.parseInt(s);

        if (value >= 90) {
            System.out.println("A");
        } else if (value >= 80) {
            System.out.println("B");
        } else if (value >= 70) {
            System.out.println("C");
        } else if (value >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
