package math.Q_2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            System.out.println(number(floor, room));
        }
    }

    private static int number(int floor, int room) {
        if (room == 1) {
            return 1;
        } else if (room == 2) {
            return 1 + floor + 1;
        } else if (floor == 0) {
            return room;
        }

        return number(floor, room - 1) + number(floor - 1, room);
    }
}
