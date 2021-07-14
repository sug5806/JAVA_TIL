package 매직_넘버를_기호_상수로_치환;

public class RobotCommand {
    private final String _name;

    public RobotCommand(String _name) {
        this._name = _name;
    }

    public String toString() {
        return "[ RobotCommand: " + _name + " ]";
    }
}
