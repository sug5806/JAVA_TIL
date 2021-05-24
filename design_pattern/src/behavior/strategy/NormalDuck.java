package behavior.strategy;

import behavior.strategy.fly_behavior.FlyWithWings;
import behavior.strategy.quack_behavior.KoreanQuack;

public class NormalDuck extends Duck {
    public NormalDuck() {
        this.quackBehavior = new KoreanQuack();
        this.flyBehavior = new FlyWithWings();
    }
}
