package test;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    static List<String> list = new ArrayList<>();
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        String dirs = "LULLLLLLU";
        String[] split = dirs.split("");

        for (String dir : split) {
            move(dir);
        }

        System.out.println(list.size());
    }

    public static void move(String dir) {
        String str = String.valueOf(x) + y;
        switch (dir) {
            case "U":
                if (y == 5) {
                    return;
                }
                y++;
                break;
            case "D":
                if (y == -5) {
                    return;
                }
                y--;
                break;
            case "R":
                if (x == 5) {
                    return;
                }
                x++;
                break;
            case "L":
                if (x == -5) {
                    return;
                }
                x--;
                break;
        }

        if (list.contains(str + x + y) || list.contains(String.valueOf(x) + y + str)) {
            return;
        }

        list.add(str + x + y);
    }

}
