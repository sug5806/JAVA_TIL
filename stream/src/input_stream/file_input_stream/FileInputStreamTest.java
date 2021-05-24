package input_stream.file_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        // FileInputStream을 만드는 방법 2가지

        // 첫번째 방법
        FileInputStream fileInputStream = new FileInputStream("src/stream/input_stream/file_input_stream/origin_test.txt");

        // 두번째 방법
        File file = new File("src/stream/input_stream/file_input_stream/origin_test.txt");
        FileInputStream fileInputStream1 = new FileInputStream(file);
    }
}
