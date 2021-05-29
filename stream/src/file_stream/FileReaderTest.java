package file_stream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        String filePath = "./stream/src/file_stream/reader.txt";

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
            char[] cbuf = new char[5];
            // cbuf의 off부터 한번에 길이 만큼(맨 끝 제외)읽는다(단 off + len이 전체 cubf의 length를 넘으면 안됨)
            // file의 내용이 cubf의 길이로 나눠 나머지가 0이 아닐경우 데이터가 일부 남아 버그 발생
//            while (fileReader.read(cbuf, 0, cbuf.length) != -1) {
            while (fileReader.read(cbuf) != -1) {
                System.out.println("1: " + cbuf[0]);
                System.out.println("2: " + cbuf[1]);
                System.out.println("3: " + cbuf[2]);
                System.out.println("4: " + cbuf[3]);
                System.out.println("5: " + cbuf[4]);

                System.out.println(cbuf);
                cbuf = new char[5];
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
