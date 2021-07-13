# private 생성자나 열거 타입으로 싱글턴임을 보증하라

싱글턴이란 인스턴스를 오직 하나만 생성할 수 있는 클래스를 말한다.

그런데 클래스를 싱글턴으로 만들면 이를 사용하는 클라이언트를 테스트하기가 어려워질 수 있다.

타입을 인터페이스로 정의한 다음 그 인터페이스를 구현해서 만든 싱글턴이 아니라면 싱글턴 인스턴스를 가짜(mock) 구현으로 대체할 수 없기 때문이다.

1. public static final 필드 방식의 싱글턴

```java
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }
}
```

private 생성자는 Elvis.INSTANCE를 초기화할 때 딱 한번만 호출된다.

2. 정적 팩터리 방식의 싱글턴

```java
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }
}
```

3. 열거 타입 방식의 싱글턴 - 바람직한 방법

```java
public enum Elvis {
    INSTANCE;
}
```

1번 방식과 비슷하지만, 더 간결하고 복잡한 직렬화 상황이나 리플렉션 공격에도 제2의 인스턴스가 생기는 일을 완벽히 막아준다.