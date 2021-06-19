package for_.Q_11021;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int count = Integer.parseInt(s);

        for (int i = 0; i < count; i++) {
            String[] values = bufferedReader.readLine().split(" ");

            bufferedWriter.write("Case #" + (i + 1) + ": " + (Integer.parseInt(values[0]) + Integer.parseInt(values[1])));
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
