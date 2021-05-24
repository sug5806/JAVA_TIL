package writer.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/stream/reader/file_writer/file_writer_test.txt", true);

        String data = "문자열 쓰기 테스트3";
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
    }
}
