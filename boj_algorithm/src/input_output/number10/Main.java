package input_output.number10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();

        String[] values = s.split(" ");

        int A = Integer.parseInt(values[0]);
        int B = Integer.parseInt(values[1]);
        int C = Integer.parseInt(values[2]);

        int a = (A + B) % C;
        int b = ((A % C) + (B % C)) % C;
        int c = (A * B) % C;
        int d = ((A % C) * (B % C)) % C;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
