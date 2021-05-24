package output_stream.file_output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        // 첫번째 방법
        FileOutputStream fileOutputStream = new FileOutputStream("src/stream/output_stream/file_output_stream/origin_test.txt");

        // 두번째 방법
        File file = new File("src/stream/output_stream/file_output_stream/origin_test.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream(file);
        System.out.println("=========================");


        String originFileName = "src/stream/output_stream/file_output_stream/origin_test.txt";
        String targetFileName = "src/stream/output_stream/file_output_stream/copy_test.txt";

        FileInputStream fileInputStream = new FileInputStream(originFileName);
        FileOutputStream fileOutputStream2 = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fileInputStream.read(readBytes)) != -1) {
            fileOutputStream2.write(readBytes, 0, readByteNo);
        }

        fileOutputStream2.flush();
        fileOutputStream2.close();
        fileInputStream.close();

        System.out.println("복사가 잘되었습니다.");
    }
}
