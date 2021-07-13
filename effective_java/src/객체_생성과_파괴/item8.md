# finalizer와 cleaner 사용을 피하라

자바는 두 가지 객체 소멸자를 제공한다. 그중 finalizer는 예측할 수 없고, 상황에 따라 위험할 수 있어 일반적으로 불필요하다. </br>
cleaner는 finalizer보다는 덜 위험하지만, 여전히 예측할 수 없고, 느리고, 일반적으로 불필요하다.

finalizer와 cleaner는 즉시 수행된다는 보장이 없다. 객체에 접근할 수 없게 된 후 finalizer나 cleaner가 실행되기까지 얼마나 걸릴지 알 수 없다. 즉, finalizer와 cleaner로는
제때 실행되어야 하는 작업은 절대 할 수 없다.

finalizer나 cleaner의 단점을 대신할것은 AutoCloseable 구현해주고, 클라이언트에서 인스턴스를 다 쓰고 나면 close 메서드를 호출하면 된다.