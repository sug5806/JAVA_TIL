package while_.Q_10952;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String[] split = s.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);

        while (x != 0 && y != 0) {
            bufferedWriter.write((x + y) + "\n");

            s = bufferedReader.readLine();

            if (s.isBlank()) {
                break;
            }

            split = s.split(" ");
            x = Integer.parseInt(split[0]);
            y = Integer.parseInt(split[1]);
        }

        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
