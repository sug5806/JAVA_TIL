package string_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @BeforeEach
    private void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("더하기 테스트")
    public void addTest() throws Exception {
        // given
        // when
        int result = stringCalculator.add("1,2");
        // then
        assertEquals(3, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    public void subTest() throws Exception {
        // given
        int result = stringCalculator.sub("1,2");
        // when

        // then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    public void divideTest() throws Exception {
        // given
        int result = stringCalculator.divide("5,2");
        // when

        // then
        assertEquals(2, result);
    }

    @Test
    @DisplayName("곱하기 테스트")
    public void multipleTest() throws Exception {
        // given
        int result = stringCalculator.multiple("3,4");
        // when

        // then
        assertEquals(12, result);
    }

    @Test
    public void 쉼표_구분자_더하기_테스트() throws Exception {
        String str = "5,2,3";
        int result = stringCalculator.add(str);
        assertEquals(10, result);
    }

    @Test
    public void 콜론_구분자_더하기_테스트() throws Exception {
        String str = "3;10;10";
        int result = stringCalculator.add(str);
        assertEquals(23, result);
    }

    @Test
    public void 콜론_또는_쉼표_구분자() {
        assertEquals(10, stringCalculator.add("2,3;5"));
    }

}