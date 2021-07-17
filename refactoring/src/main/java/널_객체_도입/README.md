# 방법

1. 널 객체 클래스 작성
    1. 널객체 클래스 작성
        - 기존 클래스(null을 확인하는 클래스)의 하위 클래스로 작성
    2. isNUll 메서드 작성
        - 기존 클래스는 false 반환
        - 널 객체 클래스는 true 반환
2. null 치환하기
    1. null을 객체로 치환
    2. null 확인을 isNull 메서드 호출로 치환
    3. 컴파일해서 테스트
3. 널 객체 클래스를 재정의해서 조건 판단 삭제하기
    1. isNull 메서드를 사용하는 조건 판단에서 다음과 같은 코드를 찾기
    ```java
        if (obj.isNull()) {
            <null> 동작
        } else {
            obj.doSomething();
        }
    ```

    2. 널 객체 클래스에서 doSomething 메서드를 오버라이드함. 이 메서드에는 <null 동작>을 작성함
    3. 조건 판단 삭제
        - obj.doSomething();
    4. 컴파일해서 테스트