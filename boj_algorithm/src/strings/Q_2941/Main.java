package strings.Q_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            char nextCh;

            if (ch == 'c' && i < length - 1) {
                nextCh = s.charAt(i + 1);

                if (nextCh == '=' || nextCh == '-') {
                    i += 1;
                }
            } else if (ch == 'd' && i < length - 1) {
                nextCh = s.charAt(i + 1);

                if (nextCh == 'z' && i < length - 2) {
                    nextCh = s.charAt(i + 2);
                    if (nextCh == '=') {
                        i += 2;
                    }
                } else if (nextCh == '-') {
                    i += 1;
                }
            } else if (ch == 'l' && i < length - 1) {
                nextCh = s.charAt(i + 1);

                if (nextCh == 'j') {
                    i += 1;
                }
            } else if (ch == 'n' && i < length - 1) {
                nextCh = s.charAt(i + 1);

                if (nextCh == 'j') {
                    i += 1;
                }
            } else if (ch == 's' && i < length - 1) {
                nextCh = s.charAt(i + 1);

                if (nextCh == '=') {
                    i += 1;
                }
            } else if (ch == 'z' && i < length - 1) {
                nextCh = s.charAt(i + 1);

                if (nextCh == '=') {
                    i += 1;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
