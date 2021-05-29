package string_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String text) {

        if (isBlank(text)) {
            return 0;
        }

        return sum(toInts(split(text)));
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private int sum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = toPositive(values[i]);
        }

        return numbers;
    }

    private String[] split(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);

        if (matcher.find()) {
            String separator = matcher.group(1);
            return matcher.group(2).split(separator);
        }

        return text.split(",|;");
    }

    private int toPositive(String value) {
        int num = Integer.parseInt(value);

        if (num < 0) {
            throw new RuntimeException("숫자는 음수일 수 없습니다.");
        }

        return num;
    }
}
