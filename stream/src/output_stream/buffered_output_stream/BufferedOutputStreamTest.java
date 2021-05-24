package output_stream.buffered_output_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = -1;
        long start = 0;
        long end = 0;

        fis = new FileInputStream("src/stream/output_stream/buffered_output_stream/test.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/stream/output_stream/buffered_output_stream/copy_test_not_use_buffer.png");
        start = System.currentTimeMillis();

        // FileOutputStream 직접 사용
        while ((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼 미사용 : " + (end - start) + "ms");

        fis = new FileInputStream("src/stream/output_stream/buffered_output_stream/test.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/stream/output_stream/buffered_output_stream/copy_test_use_buffer.png");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼 사용 : " + (end - start) + "ms");

    }
}
