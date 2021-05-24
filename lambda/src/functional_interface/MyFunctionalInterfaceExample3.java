package functional_interface;

public class MyFunctionalInterfaceExample3 {
    public static void main(String[] args) {
        MyFunctionalExample3 fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> x + y;
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> sum(x, y);


    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
