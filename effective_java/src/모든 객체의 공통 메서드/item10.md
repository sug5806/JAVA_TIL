# equals는 일반 규약을 지켜 재정의하라

equals 메서드는 다음에서 열거한 상황중 하나에 해당한다면 재정의하지 않는 것이 최선이다.

* **각 인스턴스가 본질적으로 고유하다.** 값을 표현하는게 아니라 동작하는 개체를 표현하는 클래스가 여기 해당한다. Thread가 좋은 예로, Object의 equlas 메서드는 이러한 클래스에 딱 맞게
  구현되었다.
* **인스턴스의 '논리적 동치성(logical equality)을 검사할 일이 없다.'**
* **상위 클래스에서 재정의한 equals가 하위 클래스에서 딱 들어맞는다.** 예를들어 대부분의 Set 구현체는 AbstractSet이 구현한 equals를 상속받아 쓴다.
* **클래스가 private이거나 package-private이고, equals 메서드를 호출할 일이 없다.**

그렇다면 equals를 재정의해야 할 때는 언제일까? 객체 식별성(object identity; 두 객체가 물리적으로 같은가)이 아니라 논리적 동치성을 확인해야 하는데, 상위 클래스의 equals가 논리적 동치성을
비교하도록 재정의되지 않았을때다. 주로 값 클래스들이 여기 해당한다. 값 클래스란 Integer와 String처럼 값을 표현하는 클래스를 말한다.

equals 메서드를 재정의할 때는 반드시 일반 규약을 따라야한다.

* 반사성(reflexivity) : null이 아닌 모든 참조 값 x에 대해 x.equals(x)는 true다.
* 대칭성(symmetry) : null이 아닌 모든 참조 값 x, y에 대해, x.equals(y)가 true면 y.equals(x)도 true다.
* 추이성(transitivity) : null이 아닌 모든 참조 값 x, y, z에 대해, x.equals(y)가 true 이고 y,equals(z)도 true면 x.equals(z)도 true다.
* 일관성(consistency) : null이 아닌 모든 참조 값 x, y에 대해, x.equals(y)를 반복해서 호출하면 항상 true를 반환하거나 항상 false를 반환한다.
* null-아님 : null이 아닌 모든 참조 값 x에 대해, x.equals(null)은 false이다.

양질의 equals 메서드 구현을 하는 방법

1. **== 연산자를 사용해 입력이 자신의 참조인지 확인한다.** 자기 자신이면 true를 반환한다.
2. **instanceof 연산자로 입력이 올바른 타입인지 확인한다.**
3. **입력을 올바른 타입으로 형변환한다.**
4. **입력 객체와 자기 자신의 대응되는 '핵심' 필드들이 모두 일치하는지 하나씩 검사한다.**
    * float와 double을 제외한 기본 타입 필드는 == 연산자로 비교하고, 참조 타입필드는 각각 equals 메서드로, float와 double 필드는 각각 정적 메서드인 Float.compare(
      float, float)와 Double.compare(double, double)로 비교한다.

전형적인 equals 메서드의 예

```java
public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 999, "프리픽스");
        this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
    }

    private static short rangeCheck(int va, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == this.lineNum && pn.prefix == this.prefix && pn.areaCode == this.areaCode;
    }
}
```

마지막 주의사항

* equals를 재정의할 땐 hashCode도 반드시 재정의하자.
* 너무 복잡하게 해결하려 들지 말자.
* Object 외의 타입을 매개변수로 받는 equals 메서드는 선언하지 말자.