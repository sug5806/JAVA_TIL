package strings.Q_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (isValid()) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean isValid() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;

        String st = br.readLine();

        for (int i = 0; i < st.length(); i++) {
            int now = st.charAt(i);

            if (prev != now) {
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }

        }

        return true;
    }
}
