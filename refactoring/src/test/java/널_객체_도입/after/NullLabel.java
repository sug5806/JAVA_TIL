package 널_객체_도입.after;

public class NullLabel extends Label {

    public NullLabel() {
        super("(none)");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
