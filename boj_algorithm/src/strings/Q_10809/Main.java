package strings.Q_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (char c : alphabet) {
            sb.append(str.indexOf(c)).append(" ");
        }

        System.out.println(sb.toString());

    }
}
