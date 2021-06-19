package array.Q_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            double sum = 0;

            st = new StringTokenizer(bufferedReader.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());

            List<Integer> arrayList = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
                sum += arrayList.get(j);
            }

            double average = sum / N;
            long count = arrayList.stream().filter((x) -> x > average).count();
            ;

            System.out.printf("%.3f%%\n", (count * 100.0) / N);
        }
    }
}
