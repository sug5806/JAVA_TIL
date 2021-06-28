package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        int day = 6;
        int k = 25;

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        List<Integer> result = new ArrayList<>();

        int sumDay = 0;

        for (int i = 0; i < month.length; i++) {
            if (i != 0) {
                sumDay += month[i - 1];
            } else {
                sumDay = day + k - 1;
            }

            int payDay = sumDay % 7;

            if (payDay == 5 || payDay == 6) {
                result.add(1);
            } else {
                result.add(0);
            }
        }

        Integer[] integers = result.toArray(new Integer[0]);

        System.out.println(Arrays.toString(integers));
    }
}
