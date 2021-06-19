package for_.Q_10871;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String[] values = s.split(" ");

        int x = Integer.parseInt(values[1]);

        String s1 = bufferedReader.readLine();

        values = s1.split(" ");

        for (String value : values) {
            if (Integer.parseInt(value) < x) {
                bufferedWriter.write(value + " ");
            }
        }

        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();

    }
}
