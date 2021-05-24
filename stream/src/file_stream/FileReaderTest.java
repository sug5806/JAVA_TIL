package file_stream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderTest {
    public static void main(String[] args) {
        String filePath = "src/stream/file_stream/reader.txt";

        // FileInputStream은 byte로 읽기 때문에 1바이트가 넘는 한글은 깨진다.
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int i;
            System.out.print("FileInputStream : ");
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();

        // FileReader은 문자를 읽는 스트림이기 때문에 정상 작동한다.
        try (FileReader fileReader = new FileReader(filePath)) {
            int i;
            char[] cbuf = new char[100];
            System.out.print("FileReader : ");

            while ((i = fileReader.read(cbuf, 0, cbuf.length)) != -1) {
                System.out.print(cbuf);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
