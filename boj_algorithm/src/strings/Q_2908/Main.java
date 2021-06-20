package strings.Q_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();

        String s = br.readLine();

        stringBuilder.append(s);
        stringBuilder.reverse();

        StringTokenizer stringTokenizer = new StringTokenizer(stringBuilder.toString(), " ");

        int num1 = Integer.parseInt(stringTokenizer.nextToken());
        int num2 = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(Math.max(num1, num2));
    }
}
