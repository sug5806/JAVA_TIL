package writer.buffered_writer;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        long start = 0;
        long end = 0;
        int data = -1;

        String filePath = "src/stream/writer/buffered_writer/test.txt";
        String copyFilePath1 = "src/stream/writer/buffered_writer/copy_test1.txt";
        String copyFilePath2 = "src/stream/writer/buffered_writer/copy_test2.txt";
        String copyFilePath3 = "src/stream/writer/buffered_writer/copy_test3.txt";
        String copyFilePath4 = "src/stream/writer/buffered_writer/copy_test4.txt";

        FileReader reader = null;
        FileWriter writer = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        reader = new FileReader(filePath);
        writer = new FileWriter(copyFilePath1);

        System.out.println();
        start = System.currentTimeMillis();
        while ((data = reader.read()) != -1) {
            writer.write(data);
        }

        writer.flush();
        end = System.currentTimeMillis();
        writer.close();
        reader.close();
        System.out.println("reader 버퍼 X, writer 버퍼 X : " + (end - start) + "ms");

        reader = new FileReader(filePath);
        bufferedReader = new BufferedReader(reader);
        writer = new FileWriter(copyFilePath2);

        System.out.println();
        start = System.currentTimeMillis();
        while ((data = bufferedReader.read()) != -1) {
            writer.write(data);
        }

        writer.flush();
        end = System.currentTimeMillis();
        writer.close();
        reader.close();
        System.out.println("reader 버퍼 O, writer 버퍼 X : " + (end - start) + "ms");

        reader = new FileReader(filePath);
        writer = new FileWriter(copyFilePath3);
        bufferedWriter = new BufferedWriter(writer);

        System.out.println();
        start = System.currentTimeMillis();
        while ((data = reader.read()) != -1) {
            bufferedWriter.write(data);
        }

        writer.flush();
        end = System.currentTimeMillis();
        writer.close();
        reader.close();
        System.out.println("reader 버퍼 X, writer 버퍼 O : " + (end - start) + "ms");

        reader = new FileReader(filePath);
        bufferedReader = new BufferedReader(reader);
        writer = new FileWriter(copyFilePath4);
        bufferedWriter = new BufferedWriter(writer);

        System.out.println();
        start = System.currentTimeMillis();
        while ((data = bufferedReader.read()) != -1) {
            bufferedWriter.write(data);
        }

        writer.flush();
        end = System.currentTimeMillis();
        writer.close();
        reader.close();
        System.out.println("reader 버퍼 O, writer 버퍼 O : " + (end - start) + "ms");

    }
}
