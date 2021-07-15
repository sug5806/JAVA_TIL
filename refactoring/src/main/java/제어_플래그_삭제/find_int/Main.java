package 제어_플래그_삭제.find_int;

public class Main {
    public static void main(String[] args) {
        int[] data = {
                1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
        };

        if (FindInt.find(data, 5)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found...");
        }
    }
}
