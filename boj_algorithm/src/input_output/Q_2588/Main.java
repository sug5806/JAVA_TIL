package input_output.Q_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append(A * (B % 10));
        stringBuilder.append("\n");

        stringBuilder.append(A * (B / 10 % 10));
        stringBuilder.append("\n");

        stringBuilder.append(A * (B / 100));
        stringBuilder.append("\n");

        stringBuilder.append(A * B);

        System.out.println(stringBuilder);
    }
}
