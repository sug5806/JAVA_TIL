package test;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3};

        int selectable = arr.length / 2;

        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        System.out.println(Math.min(set.size(), selectable));

    }
}
