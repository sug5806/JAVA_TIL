package 관측_데이터_복제.after;

public class ValueChangeEvent {
    private final Value _source;

    public ValueChangeEvent(Value _source) {
        this._source = _source;
    }

    public Value getSource() {
        return _source;
    }
}
