package string_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @BeforeEach
    private void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void 쉼표_구분자_테스트() throws Exception {
        String str = "5,2,3";
        int result = stringCalculator.add(str);
        assertEquals(10, result);
    }

    @Test
    public void 콜론_구분자_테스트() throws Exception {
        String str = "3;10;10";
        int result = stringCalculator.add(str);
        assertEquals(23, result);
    }

    @Test
    public void 콜론_또는_쉼표_구분자() {
        assertEquals(10, stringCalculator.add("2,3;5"));
    }

    @Test
    public void 커스텀_구분자() {
        assertEquals(8, stringCalculator.add("//z\n5z3"));
    }

    @Test
    public void 음수일때() {
        Assertions.assertThrows(RuntimeException.class, () ->
                stringCalculator.add("1;-2")
        );
    }

    @Test
    public void null_또는_빈문자() {
        assertEquals(0, stringCalculator.add(null));
        assertEquals(0, stringCalculator.add(""));
    }
}