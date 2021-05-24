package behavior.strategy;

import behavior.strategy.fly_behavior.FlyBehavior;
import behavior.strategy.quack_behavior.QuackBehavior;

public class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void changeFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void changeQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
