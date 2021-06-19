package function.Q_15596;

class Test {
    long sum(int[] a) {
        long sum = 0;

        for (int num : a) {
            sum += num;
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Test test = new Test();

        long sum = test.sum(arr);

        System.out.println(sum);

    }


}
