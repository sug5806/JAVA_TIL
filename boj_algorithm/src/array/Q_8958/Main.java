package array.Q_8958;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedReader.readLine();

        String ox;
        int O = 0;
        int result = 0;

        while ((ox = bufferedReader.readLine()) != null) {
            String[] split = ox.split("");

            for (String s1 : split) {

                if (s1.equals("O")) {
                    O++;
                    result += O;
                } else {
                    O = 0;
                }
            }

            bufferedWriter.write(result + "\n");
            O = 0;
            result = 0;
        }
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
