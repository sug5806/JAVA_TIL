package input_stream.buffered_input_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTest {
    public static void main(String[] args) throws Exception {
        long start = 0;
        long end = 0;

        FileInputStream fis1 = new FileInputStream("src/stream/input_stream/buffered_input_stream/test.png");
        start = System.currentTimeMillis();
        while (fis1.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("버퍼 미사용 : " + (end - start) + "ms");
        fis1.close();
        System.out.println("=========================");

        FileInputStream fis2 = new FileInputStream("src/stream/input_stream/buffered_input_stream/test.png");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while (bis.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("버퍼 사용 : " + (end - start) + "ms");
        fis2.close();
    }
}
