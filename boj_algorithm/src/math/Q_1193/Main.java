package math.Q_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bufferedReader.readLine());

        int prev_count_sum = 0;
        int cross_count = 1;

        while (true) {
            if (X <= cross_count + prev_count_sum) {
                if (cross_count % 2 == 1) {
                    System.out.println((cross_count + prev_count_sum + 1) - X + "/" + (X - prev_count_sum));
                } else {
                    System.out.println((X - prev_count_sum) + "/" + ((cross_count + prev_count_sum + 1) - X));
                }
                break;
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }

//        int count = 1;
//        int x = 1;
//        int y = 1;
//        boolean flag = true;
//
//        if (X == 1) {
//            System.out.println("1/1");
//            return;
//        }
//
//        while (count < X) {
//            if (flag) {
//                if ((x + y) - 1 == y) {
//                    y++;
//                    flag = false;
//                } else {
//                    x--;
//                    y++;
//                }
//            } else {
//                if ((x + y) - 1 == x) {
//                    x++;
//                    flag = true;
//                } else {
//                    x++;
//                    y--;
//                }
//            }
//            count++;
//        }
//
//        System.out.printf("%d/%d\n", x, y);

    }
}
