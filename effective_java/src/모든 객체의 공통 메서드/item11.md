# equals를 재정의하려거든 hashCode도 재정의하라

equals를 재정의한 클래스 모두에서 hashCode도 재정의해야 한다.

* equals(Object)가 두 객체를 같다고 판단했다면, 두 객체의 hashCode는 똑같은 값을 반환해야한다.

좋은 hashCode를 작성하는 간단한 요령

1. int 변수 result를 선언한 후 값 c로 초기화한다. 이때 c는 해당 객체의 첫번째 핵심 필드를 단계 2.a 방식으로 계산한 해시코드
    * 핵심필드란 equals 비교에 사용되는 필드를 말한다.
2. 해당 객체의 나머지 핵심 필드 f 각각에 대해 다음 작업을 수행한다.
    * 해당 필드의 해시코드 c를 계산한다.
        * 기본 타입 필드라면, Type.hashCode(f)를 수행한다. 여기서 Type은 해당 기본 타입의 박싱 클래스이다.
        * 참조 타입 필드면서 이 클래스의 equals 메서드가 이 필드의 equals를 재귀적으로 호출해 비교한다면, 이 필드의 hashCode를 재귀적으로 호출한다. 계산이 더 복잡해질것 같으면, 이
          필드의 표준형을 만들어 그 표준형의 hashCode를 호출한다. 필드의 값이 null이면 0을 사용한다.
        * 필드가 배열이라면, 핵심 원소 각각을 별도 필드처럼 다룬다. 이상의 규칙을 재귀적으로 적용해 각 핵심 원소가 하나도 없다면 단순히 상수를 사용한다. 모든 원소가 핵심 원소라면
          Arrays.hashCode를 사용한다.
    * 단계 2.a에서 계산한 해쉬코드 c로 result를 갱신한다. `result = 31 * result + c`;
3. result를 반환한다.

이 요령을 PhoneNumber 클래스에 적용해보자 (item10에 참조)

```java
@Override
public int hashCode(){
        int result=Short.hashCode(areaCode);
        result=31*result+Short.hashCode(prefix);
        result=31*result+Short.hashCode(lineNum);
        return result;
        }
```