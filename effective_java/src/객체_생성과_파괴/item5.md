# 자원을 직접 명싱하지 말고 의존 객체 주입을 사용하라.

인스턴스를 생성할 때 생성자에 필요한 자원을 넘겨주는 방식이다.

의존 객체 주입은 유연성과 테스트 용이성을 높여준다.

```java
import java.util.Objects;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexion dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }
}
```

> 클래스가 내부적으로 하나 이상의 자원에 의존하고, 그 자원이 클래스 동작에 영향을 준다면 싱글턴과 정적 유틸리티 클래스는 사용하지 않는것이 좋다. 이 자원들을 클래스가 직접 만들게 해서도 안된다. 대신 필요한 자원을 생성자에 넘겨주자. 의존 객체 쥡이라 하는 이 기법은 클래스의 유연성, 재사용성, 테스트 용이성을 기막히게 개선해준다.