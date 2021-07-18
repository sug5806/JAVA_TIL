package 상속을_위임으로_치환.after;

import java.util.Random;

public class Dice {
    private final Random _random;

    public Dice() {
        _random = new Random(313123L);
    }

    public Dice(long seed) {
        _random = new Random(seed);
    }

    public void setSeed(long seed) {
        _random.setSeed(seed);
    }

    public int nextInt() {
        return _random.nextInt(6) + 1;
    }
}
