package for_.Q_2439;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int count = Integer.parseInt(s);

        for (int i = 1; i <= count; i++) {
            bufferedWriter.write(" ".repeat(count - i) + "*".repeat(i) + "\n");
        }

        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
