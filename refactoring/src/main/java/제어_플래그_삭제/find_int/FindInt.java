package 제어_플래그_삭제.find_int;

public class FindInt {
    public static boolean find(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }

        return false;

    }
}
