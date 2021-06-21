package math.Q_10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int height;
        int width;
        int number;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            number = Integer.parseInt(st.nextToken());

            int x, y;

            if (number % height != 0) {
                x = (number % height) * 100;
                y = (number / height) + 1;
                System.out.println(x + y);
            } else {
                x = height * 100;
                y = number / height;
                System.out.println(x + y);
            }
        }
    }
}
