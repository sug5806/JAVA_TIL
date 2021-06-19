package if_.Q_2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] values = bufferedReader.readLine().split(" ");

        int hour = Integer.parseInt(values[0]);
        int minute = Integer.parseInt(values[1]);

        if (hour > 0) {
            if (minute - 45 < 0) {
                hour = hour - 1;
                minute = 60 + (minute - 45);
            } else {
                minute = minute - 45;
            }

        } else {
            if (minute - 45 < 0) {
                hour = 23;
                minute = 60 + (minute - 45);
            } else {
                minute = minute - 45;
            }

        }

        System.out.println(hour + " " + minute);

    }
}
