package for_.Q_15552;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int count = Integer.parseInt(s);

        for (int i = 0; i < count; i++) {
            String s1 = bufferedReader.readLine();

            String[] values = s1.split(" ");

            bufferedWriter.write(Integer.parseInt(values[0]) + Integer.parseInt(values[1]) + "\n");
        }
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
