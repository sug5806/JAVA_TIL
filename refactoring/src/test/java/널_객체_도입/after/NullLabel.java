package 널_객체_도입.after;

public class NullLabel extends Label {

    private NullLabel() {
        super("(none)");
    }

    public static Label newNull() {
        return new NullLabel();
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void display() {
    }
}
