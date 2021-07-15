package 제어_플래그_삭제.simple_database;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleDatabaseTest {

    @Test
    public void 파일_테스트() {
        try {
            FileReader fileReader = new FileReader("src/main/java/제어_플래그_삭제/simple_database/dbfile.txt");

            SimpleDatabase db = new SimpleDatabase(fileReader);

            assertThat("Hiroshi Yuki").isEqualTo(db.getValue("hyuki@example.com"));
            assertThat("Sato Hanako").isEqualTo(db.getValue("sato@example.com"));
            assertThat("Tomura").isEqualTo(db.getValue("tomura@example.com"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}