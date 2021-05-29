package string_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        int result = stringCalculator.add("a");
        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    public void subTest() throws Exception {
        // given
        int result = stringCalculator.sub("a");
        // when

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    public void divideTest() throws Exception {
        // given
        int result = stringCalculator.divide("a");
        // when

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("곱하기 테스트")
    public void multipleTest() throws Exception {
        // given
        int result = stringCalculator.multiple("a");
        // when

        // then
        Assertions.assertEquals(0, result);
    }
}