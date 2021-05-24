package reader.file_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CsvFileTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/stream/reader/file_reader/csv_file_test.csv");
        BufferedReader br = new BufferedReader(fr);

        String line = "";

        while ((line = br.readLine()) != null) {
            System.out.println("line = " + line);
        }
        br.close();
        fr.close();

    }
}
