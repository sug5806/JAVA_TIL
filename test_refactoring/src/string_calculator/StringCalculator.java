package string_calculator;

public class StringCalculator {
    public int add(String str) {
        String[] numbers = stringSplit(str);
        int result = 0;
        for (String number : numbers) {
            result = result + Integer.parseInt(number);
        }
        return result;
    }

    public int sub(String str) {
        String[] numbers = stringSplit(str);
        return Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
    }

    public int divide(String str) {
        String[] numbers = stringSplit(str);
        return Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
    }

    public int multiple(String str) {
        String[] numbers = stringSplit(str);
        return Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
    }

    private String[] stringSplit(String str) {
        return str.split(",|;");
    }
}
