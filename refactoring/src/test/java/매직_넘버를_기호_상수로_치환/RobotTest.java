package 매직_넘버를_기호_상수로_치환;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class RobotTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private Robot robot = new Robot("Andrew");

    @BeforeEach
    public void redirectOut() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void cleanUpOut() {
        System.setOut(null);
    }

    @Test
    public void 로봇_동작_테스트() {
        robot.order(Robot.COMMAND_WALK);
        assertThat("Andrew walks.\n").isEqualTo(out.toString());

        robot.order(Robot.COMMAND_STOP);
        assertThat("Andrew walks.\nAndrew stops.\n").isEqualTo(out.toString());

        robot.order(Robot.COMMAND_JUMP);
        assertThat("Andrew walks.\nAndrew stops.\nAndrew jumps.\n").isEqualTo(out.toString());
    }
}