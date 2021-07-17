package 메서드_추출.after;

public class Banner {
    private final String _content;

    public Banner(String content) {
        _content = content;
    }

    public void print(int times) {
        printBorder();
        printContent(times);
        printBorder();
    }

    private void printContent(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("|" + _content + "|");
        }
    }

    private void printBorder() {
        System.out.print("+");
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}