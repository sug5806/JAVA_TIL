package math.Q_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int count = 1; // 마지막날을 포함하기 때문에 1부터 시작

        // 마지막날은 올라가기만 하고 내려오지 않으므로 낮에 올라갈수 있는 높이를 뺴준다.
        height -= up;

        // 낮에 올라갈 수 있는 높이를 뺴주고 (낮에 올라 갈 수 있는 높이 - 밤에 미끄러지는 높이)를 나눠주면 마지막날을 제외한 날들이 며칠이 걸리는지 알 수 있다.
        int day = height / (up - down);

        if (height - (up - down) * day <= 0) {
            count += day;
        } else {
            count += day + 1;
        }

        System.out.println(count);
    }
}
