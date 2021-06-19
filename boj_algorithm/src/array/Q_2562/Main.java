package array.Q_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();

        String str;

        while ((str = bufferedReader.readLine()) != null) {
            arrayList.add(Integer.parseInt(str));
        }

        Integer max = Collections.max(arrayList);
        int i = arrayList.indexOf(max);

        System.out.println(max);
        System.out.println(i + 1);
    }
}
