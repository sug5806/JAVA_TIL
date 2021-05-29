package string_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String text) {
        String[] numbers;

        if (text == null) {
            return 0;
        } else if (text.equals("")) {
            return 0;
        } else if (text.startsWith("/")) {
            numbers = customSeparatorSplit(text);
        } else {
            numbers = separatorSplit(text);
        }

        int result = 0;

        for (String number : numbers) {
            validator(number);
            result = result + Integer.parseInt(number);
        }

        return result;
    }

    private String[] customSeparatorSplit(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);

        if (matcher.find()) {
            String separator = matcher.group(1);
            return matcher.group(2).split(separator);
        }

        return null;
    }

    private String[] separatorSplit(String text) {
        return text.split(",|;");
    }

    private void validator(String num) {
        if (Integer.parseInt(num) < 0) {
            throw new RuntimeException("숫자는 음수일 수 없습니다.");
        }
    }
}
