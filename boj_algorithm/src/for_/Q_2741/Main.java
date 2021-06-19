package for_.Q_2741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String s = bufferedReader.readLine();

        int count = Integer.parseInt(s);

        for (int j = 0; j < count; j++) {
            bufferedWriter.write(j + 1 + "\n");
        }

        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
