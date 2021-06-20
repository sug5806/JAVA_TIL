package math.Q_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        long go = Integer.parseInt(st.nextToken());
        long product = Integer.parseInt(st.nextToken());
        long price = Integer.parseInt(st.nextToken());

        if (product >= price) {
            System.out.println(-1);
            return;
        }

        System.out.println((go / (price - product)) + 1);
    }
}
