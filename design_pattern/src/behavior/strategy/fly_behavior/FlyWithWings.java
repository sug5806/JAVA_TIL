package behavior.strategy.fly_behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날개로 날아갑니다.");
    }
}
