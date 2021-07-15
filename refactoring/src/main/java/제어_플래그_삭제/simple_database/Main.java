package 제어_플래그_삭제.simple_database;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("refactoring/src/main/java/제어_플래그_삭제/simple_database/dbfile.txt");

            SimpleDatabase db = new SimpleDatabase(fileReader);

            Iterator<String> it = db.iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println("KEY: \"" + key + "\"");
                System.out.println("VALUE: \"" + db.getValue(key) + "\"");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}