package reader.file_reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        String originTextPath = "src/stream/reader/file_reader/file_reader_test.txt";

        FileReader fileReader = new FileReader(originTextPath);

        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo = fileReader.read(cbuf)) != -1) {
            System.out.println("한번에 읽나요?");
            String data = new String(cbuf, 0, readCharNo);
            System.out.println("data = " + data);
        }

        fileReader.close();
    }
}
