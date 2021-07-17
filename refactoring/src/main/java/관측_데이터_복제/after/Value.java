package 관측_데이터_복제.after;

import java.util.ArrayList;
import java.util.List;

public class Value {
    private final List<ValueListener> _listeners = new ArrayList<>();

    private int _value = 0;

    public Value(int value) {
        _value = value;
    }

    public int getValue() {
        return _value;
    }

    public void setValue(int value) {
        _value = value;
    }

    public void addValueListener(ValueListener listener) {
        _listeners.add(listener);
    }


}