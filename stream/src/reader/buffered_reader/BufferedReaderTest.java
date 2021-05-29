package reader.buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        long start = 0;
        long end = 0;
        String textFile = "./stream/src/reader/buffered_reader/test.txt";

        FileReader fileReader1 = new FileReader(textFile);

        start = System.currentTimeMillis();
        while (fileReader1.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("버퍼 미사용 : " + (end - start) + "ms");
        fileReader1.close();

        FileReader fileReader2 = new FileReader(textFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader2);
        start = System.currentTimeMillis();
        while (bufferedReader.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("버퍼 사용 : " + (end - start) + "ms");
        fileReader2.close();
    }
}
