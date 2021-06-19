package for_.Q_11022;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int count = Integer.parseInt(s);

        for (int i = 0; i < count; i++) {
            String[] values = bufferedReader.readLine().split(" ");

            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);

            bufferedWriter.write("Case #" + (i + 1) + ": " + x + " + " + y + " = " + (x + y));
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
