package 매직_넘버를_기호_상수로_치환;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");

        robot.order(Robot.COMMAND_WALK);
        robot.order(Robot.COMMAND_STOP);
        robot.order(Robot.COMMAND_JUMP);
    }
}
